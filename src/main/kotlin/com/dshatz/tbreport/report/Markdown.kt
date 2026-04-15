package com.dshatz.tbreport.report

import com.dshatz.tbreport.model.TestCase
import com.dshatz.tbreport.model.TestSuite
import com.dshatz.tbreport.parse.ParseJUnit

object Markdown {

    fun generate(
        suites: List<TestSuite>
    ): String {

        fun StringBuilder.appendFailedList(
            suite: TestSuite
        ) {
            if (suite.cases.any { it.failure != null }) {
                appendLine("### Failures")
            }
            suite.cases.forEach {
                if (it.failure != null) {

                    appendLine("${it.statusSymbol()} **${it.name}** - failed after ${it.time}: `${it.failure.message}`")
                    appendLine()
                    appendBlock("details") {
                        appendBlock("summary") {
                            appendLine("Stacktrace")
                        }
                        appendLine()
                        appendLine("```log")
                        appendLine(it.failure.stackTrace ?: it.failure.message)
                        appendLine("```")
                    }
                    appendLine()
                }
            }
        }

        fun StringBuilder.appendNested(
            suite: TestSuite,
        ) {

            appendLine()
            appendLine("### \uD83D\uDCE6 Suite `${suite.name}`")
            appendLine("<details open>")
            appendLine("<summary>Tests</summary>")
            appendLine("<blockquote>")

            if (suite.cases.isNotEmpty()) {
                val caseTable = suite.cases.asSequence().map {
                    val status = it.statusSymbol()
                    val details = it.failure?.let { f ->
                        "${f.type}"
                    } ?: "Success"
                    mapOf(
                        "Status" to status,
                        "Test Case" to "`${it.name}`",
                        "Duration" to it.time.toString(),
                        "Details" to details
                    )
                }
                appendLine()
                appendLine("### Test Cases")
                makeTable(caseTable)
                appendFailedList(suite)
            }


            appendLine()
            if (suite.children.isNotEmpty()) {
                appendLine("### Child Test Suites")
                suite.children.forEach {
                    appendNested(it)
                }
            }
            append("</blockquote>")
            appendLine("</details>")
        }

        val nested = suites.map(ParseJUnit::mergeHierarchy)
        return buildString {
            appendLine("## Summary")
            nested.forEach { s ->
                appendNested(s)
            }
        }
    }

    fun StringBuilder.makeTable(
        entries: Sequence<Map<String, String>>
    ) {
        appendLine()
        appendLine("| ${entries.first().keys.joinToString(" | ")} |")
        appendLine("| ${":--- | ".repeat(entries.first().size)}")
        entries.forEach {
            appendLine("| ${it.values.joinToString(" | ")} |")
        }
    }

    fun StringBuilder.appendLines(text: String) {
        text.lines().forEach(::appendLine)
    }

    fun StringBuilder.appendBlock(tag: String, inline: String = "", vararg attrs: String, content: StringBuilder.() -> Unit) {
        appendLine("<$tag ${attrs.joinToString(" ")}>$inline")
        val sb = StringBuilder()
        sb.content()
        appendLine(sb.toString()/*.prependIndent("    ")*/) // indent breaks markdown inside <summary> for some reason.
        appendLine("</$tag>")
    }

}

fun TestCase.statusSymbol(): String {
    return if (pass) "✅" else "❌"
}