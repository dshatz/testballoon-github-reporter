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
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.io.buffered
import kotlinx.io.files.Path
import kotlinx.io.files.SystemFileSystem
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToStream
import kotlinx.serialization.json.io.encodeToSink
import kotlin.io.path.outputStream

object Github {
    private val json = Json {
        ignoreUnknownKeys = true
        prettyPrint = true
    }
    private val http = HttpClient(Java) {
        install(ContentNegotiation) {
            json(json)
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
        return System.getenv()["COMMIT_SHA"] ?: error("No env GITHUB_SHA")
    }

    private val token: String by lazy { System.getenv()["GITHUB_TOKEN"] ?: error("No env GITHUB_TOKEN") }

    suspend fun createCheckRun(check: CheckRun) {
        val (owner, repo) = getOwnerAndRepo()
        http.post("$owner/$repo/check-runs") {
            bearerAuth(token)
            setBody(check)
        }
    }

    suspend fun fetchArtifactInfo(branch: String, name: String): Artifact? {
        val (owner, repo) = getOwnerAndRepo()
        return http.get("$owner/$repo/actions/artifacts") {
            parameter("branch", branch)
            parameter("name", name)
            parameter("per_page", 1)
        }.body<ArtifactListResponse>().artifacts.firstOrNull()
    }

    suspend fun getLatestResults(artifact: Artifact): LatestResults {
        return http.get(artifact.downloadUrl).body<LatestResults>()
    }

    @OptIn(ExperimentalSerializationApi::class)
    fun writeResults(results: LatestResults) {
        java.nio.file.Path.of("results.json").outputStream().buffered().use {
            json.encodeToStream(results, it)
        }
    }
}