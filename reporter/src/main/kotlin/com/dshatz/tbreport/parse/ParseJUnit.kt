package com.dshatz.tbreport.parse

import com.dshatz.tbreport.junit.JUnitTestSuite
import com.dshatz.tbreport.model.PlatformHints
import com.dshatz.tbreport.model.TestCase
import com.dshatz.tbreport.model.TestSuite
import com.dshatz.tbreport.model.getPlatform

object ParseJUnit {

    fun parseFile(file: JUnitTestSuite, platformHints: PlatformHints): List<TestSuite> {
        val tests = file.testCases.map {
            val name = TestName.fromFile(file.fileName, it.name, it.className)
            TestCase(
                suitePath = name.suitePath,
                name = name.testName,
                platform = name.platform.takeUnless { it.isBlank() } ?: platformHints.getPlatform(file.fileName) ?: "Unknown",
                pass = it.failure == null,
                time = it.time,
                className = it.className,
                failure = it.failure,
                runner = file.runner
            )
        }

        return tests.groupBy { it.suitePath }.map { (classname, cases) ->
            TestSuite(
                classname.joinToString("."),
                path = classname,
                cases = cases,
                children = emptyList()
            )
        }
    }

    fun parseMany(
        files: List<JUnitTestSuite>,
        platformHints: PlatformHints
    ): List<TestSuite> {
        return files.flatMap { parseFile(it, platformHints) }
    }

    fun mergeHierarchy(suite: TestSuite): TestSuite {
        val currentPathSize = suite.path.size
        val thisLevelSize = currentPathSize + 1  // path + this suite's name

        // Cases stay here if: path ends exactly at this level (no further nesting)
        val (stayingCases, movingCases) = suite.cases.partition {
            it.suitePath.size <= thisLevelSize
        }

        // Group moving cases by the segment right after this suite's full path
        val groupedByNextSegment = movingCases.groupBy { it.suitePath.getOrNull(thisLevelSize) ?: "__unknown__" }

        val updatedExistingChildrenNames = mutableSetOf<String>()
        val newChildren = suite.children.map { child ->
            updatedExistingChildrenNames.add(child.name)
            val casesForThisChild = groupedByNextSegment[child.name] ?: emptyList()
            mergeHierarchy(child.copy(cases = child.cases + casesForThisChild))
        }.toMutableList()

        groupedByNextSegment.forEach { (name, cases) ->
            if (name !in updatedExistingChildrenNames) {
                val newSubSuite = TestSuite(
                    name = name,
                    path = suite.path + name,
                    cases = cases,
                    children = emptyList()
                )
                newChildren.add(mergeHierarchy(newSubSuite))
            }
        }

        return suite.copy(
            cases = stayingCases,
            children = newChildren
        )
    }
}