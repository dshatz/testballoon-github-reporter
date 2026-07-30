package com.dshatz.tbreport.util

import com.dshatz.tbreport.junit.AndroidJunitFile
import com.dshatz.tbreport.junit.JUnitTestSuite
import com.dshatz.tbreport.model.TestSuite
import com.dshatz.tbreport.parse.xml
import kotlinx.serialization.decodeFromString
import java.io.File
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.absolutePathString


fun readFile(path: String): List<JUnitTestSuite> {
    val s = File(path).inputStream().buffered().use {
        it.readAllBytes().decodeToString()
    }
    return runCatching {
        listOf(xml.decodeFromString<JUnitTestSuite>(s).copy(fileName = path))
    }.getOrElse {
        xml.decodeFromString<AndroidJunitFile>(s).suites.map { it.copy(fileName = path) }
    }
}

private fun String.normalizePattern(): String {
    return replace("/**/*.xml", "/**.xml")
        .replace("/**/*.json", "/**.json")
}

fun matchesGlobPattern(pattern: String, path: String): Boolean {
    val cwd = Paths.get("").toAbsolutePath().normalize()
    val normalizedPattern = pattern.normalizePattern()

    val matcher = FileSystems.getDefault().getPathMatcher("glob:$normalizedPattern")
    val relative = cwd.relativize(Path.of(path).toAbsolutePath().normalize())
    return matcher.matches(relative)
}

fun findFiles(startDir: String, pattern: String): List<JUnitTestSuite> {
    val normalizedPattern = pattern.normalizePattern()

    val matcher = FileSystems.getDefault().getPathMatcher("glob:$normalizedPattern")
    val startPath = Paths.get(startDir)

    return Files.walk(startPath)
        .filter { path ->
            val relativePath = startPath.relativize(path.toAbsolutePath().normalize())
            matcher.matches(relativePath)
        }
        .toList()
        .flatMap {
            try {
                val f = readFile(it.absolutePathString())
                println("Parsed JUnit file ${it.toAbsolutePath()}")
                f
            } catch (e: Exception) {
                println("WARN: Failed to parse JUnit file ${it.toAbsolutePath()}: ${e.message}")
                emptyList()
            }
        }.toList()
}