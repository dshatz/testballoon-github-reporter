package com.dshatz.tbreport.github

import com.dshatz.tbreport.LatestResults
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.java.Java
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.accept
import io.ktor.client.request.bearerAuth
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsBytes
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json

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

    suspend fun fetchArtifactInfo(branch: String, name: String): Artifact {
        val (owner, repo) = getOwnerAndRepo()
        return http.get("$owner/$repo/actions/artifacts") {
            parameter("branch", branch)
            parameter("name", name)
            parameter("per_page", 1)
        }.body<ArtifactListResponse>().artifacts.first()
    }

    suspend fun getLatestResults(artifact: Artifact): LatestResults {
        return http.get(artifact.downloadUrl).body<LatestResults>()
    }
}