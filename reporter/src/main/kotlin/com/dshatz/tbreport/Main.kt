package com.dshatz.tbreport

import com.dshatz.tbreport.github.Github
import com.dshatz.tbreport.github.generateCheckRun
import com.dshatz.tbreport.junit.JUnitTestSuite
import com.dshatz.tbreport.model.PlatformHints
import com.dshatz.tbreport.model.countSuccessful
import com.dshatz.tbreport.model.countTotal
import com.dshatz.tbreport.model.getPlatform
import com.dshatz.tbreport.parse.ParseJUnit
import com.dshatz.tbreport.report.MultiplatformReporter
import com.dshatz.tbreport.util.findFiles
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.required
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.absolutePathString
import kotlin.io.path.inputStream
import kotlin.io.path.outputStream

@OptIn(ExperimentalSerializationApi::class)
fun main(args: Array<String>) {

    val (files, platformHints, output) = parseArgsAndCollectFiles(args)
    val suites = ParseJUnit.parseMany(files, platformHints)

    val last = runCatching {
        Path.of("previous-results.json").inputStream().use {
            Json.decodeFromStream<LatestResults>(it)
        }
    }.onFailure {
        println("Failed to read previous-results.json: ${it.message}")
    }.getOrNull()

    val current = LatestResults(suites)
    val md = MultiplatformReporter.generate(suites, current, last)

    output.outputStream().buffered().use {
        it.write(md.encodeToByteArray())
    }
    println("Written to ${output.absolutePathString()}")

    runBlocking {
        Github.writeResults(current)

        if (last != null) {
            println("Last run tests: ${last.suites.countTotal()} (${last.suites.countSuccessful()})")
        }
        println("Current run tests: ${suites.countTotal()} (${suites.countSuccessful()})")

        Github.createCheckRun(generateCheckRun(suites, md))
    }
}

private data class Input(
    val files: List<JUnitTestSuite>,
    val platformHints: PlatformHints,
    val output: Path
)

private fun parseArgsAndCollectFiles(args: Array<String>): Input {
    val parser = ArgParser("testballoon-reporter.jar")
    val reports by parser.option(
        ArgType.String,
        description = "Glob pattern for XML test results (e.g., **/test-results/**/*.xml)"
    ).required()

    val output by parser.option(
        ArgType.String,
        description = "Path of summary markdown file"
    ).required()

    val platformHintsJsonInline by parser.option(
        ArgType.String,
        fullName = "platform-hints",
        description = "Custom platform hints for specific XML file path patterns. (as JSON)"
    )
    val platformHintsJsonFile by parser.option(
        type = ArgType.String,
        fullName = "platform-hints-file",
        description = "Custom platform hints for specific XML file path patterns (as a JSON file)."
    )
    parser.parse(args)

    val platformHintsJson = if (platformHintsJsonInline.provided()) {
        platformHintsJsonInline.orEmpty()
    } else runCatching {
        Path.of(platformHintsJsonFile).inputStream().buffered().use { it.readAllBytes() }.decodeToString()
    }.getOrNull()

    val platformHints = if (platformHintsJson.provided()) {
        runCatching {
            Json.decodeFromString<PlatformHints>(platformHintsJson!!).also {
                println("Using platform-hints: $it")
            }
        }.recover { error("Failed to parse platform-hints: ${it.message}") }.getOrNull() ?: emptyMap()
    } else emptyMap()

    println("Using platformHints = $platformHints")
    val cwd = Paths.get("").absolutePathString()


    val files = findFiles(cwd, reports).map {
        val platform = platformHints.getPlatform(it.fileName).orEmpty()
        it.copy(runner = platform)
    }


    println("Found ${files.size} XML files")
    return Input(
        files,
        platformHints,
        Path.of(output),
    )
}

private fun String?.provided(): Boolean {
    return !this.isNullOrBlank()
}