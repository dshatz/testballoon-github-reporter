package com.dshatz.tbreport.parse

import kotlin.io.path.Path
import kotlin.io.path.nameWithoutExtension

@JvmInline
value class TestName private constructor(val parts: List<String>) {

    val testName: String
        get() = parts[parts.indices.last - 1]

    val platform: String
        get() = parts.last()

    val suitePath: List<String>
        get() = parts.dropLast(2)

    companion object {

        private val fileNameRegex = Regex("((TEST-suite_)|(TEST-))(.+)")

        // testSuite[linuxX64]
        private val namePlatformRegex = Regex("^(.+?)(?:\\s*\\[(.+)\\])?$")

        fun fromFile(filename: String, testName: String, testClassName: String, platformOverride: String? = null): TestName {
            val suiteName = listOf(testClassName.split('.').last())

            val (platform, test) = namePlatformRegex.findAll(testName).first().groupValues.run {
                get(2) to get(1)
            }

            val finalPlatform = platformOverride ?: platform

            return TestName(suiteName + test + finalPlatform)
        }
    }
}