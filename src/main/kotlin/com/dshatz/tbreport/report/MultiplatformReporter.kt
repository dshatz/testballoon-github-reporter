package com.dshatz.tbreport.report

import com.dshatz.tbreport.model.TestCase
import com.dshatz.tbreport.model.TestSuite
import com.dshatz.tbreport.report.Markdown.appendBlock
import com.dshatz.tbreport.report.Markdown.makeTable

object MultiplatformReporter {


    fun generate(suites: List<TestSuite>): String {
        return buildString {
            suites.groupBy { it.name }.forEach { (name, suites) ->
                val cases = suites.asSequence().flatMap { it.cases }
                appendLine("## $name")
                val table = cases.collectPlatformResults()
                makeTable(table)

                val failed = cases.filterNot { it.pass }
                val totalCount = cases.count()
                val failedCount = failed.count()
                if (failedCount > 0) {
                    appendLine("### ❌ $failedCount / $totalCount tests failed")
                } else {
                    appendLine("### ✅ $totalCount tests passed")
                }
                failed.forEach { case ->
                    appendBlock("details") {
                        appendBlock("summary", inline = "❌") {
                            appendLine()
                            appendLine(" `${case.name}` on ${case.platformName()} failed after ${case.time}")
                            appendLine()
                        }
                        appendBlock("blockquote") {
                            makeTable(sequenceOf(case.collectFailedTests()))
                            appendLine("```log")
                            appendLine(case.failure?.stackTrace.orEmpty())
                            appendLine("```")
                        }
                    }
                    appendLine()
                }
            }
        }
    }

    private fun TestCase.collectFailedTests(): Map<String, String> {
        return mapOf(
            "Name" to "${name} ❌",
            "Platform" to platformName(),
            "Failure" to failure?.message.orEmpty()
        )
    }

    private fun Sequence<TestCase>.collectPlatformResults(): Sequence<Map<String, String>> {
        return groupBy { it.name }.map { (testName, cases) ->
            buildMap {
                put("Name", testName)
                cases.sortedBy { it.platformName() }.forEach { case ->
                    put(case.platformName(), "${case.statusSymbol()} ${case.time}")
                }
            }
        }.asSequence()
    }

    private fun TestCase.platformName(): String {
        return if (runner != null && platform == "jvm") "jvm (${runner})"
        else platform
    }
}