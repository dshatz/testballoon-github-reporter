package com.dshatz.tbreport.github

import com.dshatz.tbreport.model.TestSuite
import io.ktor.client.HttpClient
import io.ktor.client.engine.java.Java
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.accept
import io.ktor.client.request.bearerAuth
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.random.Random

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

object Github {
    private val http = HttpClient(Java) {
        install(ContentNegotiation) {
            json()
        }
        install(Logging) {
            level = LogLevel.ALL
        }
        defaultRequest {
            url("https://api.github.com/repos/")
            contentType(ContentType.Application.Json)
            accept(ContentType("application", "vnd.github+json"))
        }
        expectSuccess = true
    }

    private fun getOwnerAndRepo(): Pair<String, String> {
        val env = System.getenv()["GITHUB_REPOSITORY"] ?: error("No env GITHUB_REPOSITORY")
        return env.split('/').let {
            it[0] to it[1]
        }
    }

    fun getSha(): String {
        return System.getenv()["GITHUB_SHA"] ?: error("No env GITHUB_SHA")
    }

    private val token: String = System.getenv()["GITHUB_TOKEN"] ?: error("No env GITHUB_TOKEN")

    suspend fun createCheckRun(check: CheckRun) {
        val (owner, repo) = getOwnerAndRepo()
        http.post("$owner/$repo/check-runs") {
            bearerAuth(token)
            setBody(check)
        }
    }
}

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
