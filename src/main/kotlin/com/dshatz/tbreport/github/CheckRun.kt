package com.dshatz.tbreport.github

import com.dshatz.tbreport.model.TestSuite
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CheckRun(
    val name: String,
    @SerialName("head_sha") val sha: String,
    val output: CheckOutput,
    val status: String = "completed",
    val conclusion: String
)

@Serializable
data class CheckOutput(
    val title: String,
    val summary: String,
    val text: String
)

fun generateCheckRun(suites: List<TestSuite>, report: String): CheckRun {
    val cases = suites.asSequence().flatMap { it.cases }
    val successful = cases.count { it.pass }
    val failed = cases.count { !it.pass }

    val conclusion = if (failed == 0) "success" else "failure"
    val summary = buildList {
        if (failed > 0) add("$failed failed")
        if (successful > 0) add("$successful passed")
    }.joinToString(", ")
    val summaryMd = buildList {
        if (failed > 0) add("❌ $failed failed")
        if (successful > 0) add("✅ $successful passed")
    }.joinToString("\n")
    return CheckRun(
        name = "Test Results",
        sha = Github.getSha(),
        output = CheckOutput(summaryMd, text = summary, summary = report),
        conclusion = conclusion
    )
}
