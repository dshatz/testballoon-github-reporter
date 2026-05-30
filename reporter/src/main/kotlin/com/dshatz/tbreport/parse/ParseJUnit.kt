package com.dshatz.tbreport.parse

import com.dshatz.tbreport.junit.JUnitFile
import com.dshatz.tbreport.model.PlatformHints
import com.dshatz.tbreport.model.TestCase
import com.dshatz.tbreport.model.TestSuite
import com.dshatz.tbreport.model.getPlatform
import kotlin.io.path.Path
import kotlin.io.path.name
import kotlin.io.path.nameWithoutExtension

object ParseJUnit {

    fun parseFile(file: JUnitFile, platformHints: PlatformHints): List<TestSuite> {
        val path = Path(file.fileName)
        val fileName = path.nameWithoutExtension
        val tests = file.testCases.map {
            val name = TestName.fromFile(file.fileName, file.suiteName, it.name)
            TestCase(
                suitePath = name.suitePath,
                name = name.testName,
                platform = name.platform ?: platformHints.getPlatform(file.fileName) ?: "Unknown",
                pass = it.failure == null,
                time = it.time,
                className = it.className,
                failure = it.failure,
                runner = file.runner
            )
        }

//        val suitePathSegments = file.name.split('↘').map { it.trim() }
        return tests.groupBy { it.suitePath }.map { (classname, cases) ->
            TestSuite(
                classname.joinToString("."),
                path = classname,
                cases = cases,
                children = emptyList()
            )
        }
        /*val commonClassName = file.testCases.map { it.className }.toSet().singleOrNull()
            ?: error("Test cases have different classnames: ${file.name}")
        return TestSuite(
            commonClassName,
            suitePathSegments.dropLast(1),
            tests,
            emptyList(),
        )*/
    }

    fun parseMany(
        files: List<JUnitFile>,
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