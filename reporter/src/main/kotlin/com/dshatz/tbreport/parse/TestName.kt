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
        fun ofRaw(testName: String, fileName: String): TestName {

            // group 4 is one of:
            // com.dshatz.tbreport.commonTest (jvm)
            // linuxX64Test.commonTest.nested.xml (other)
            val suiteName = fileNameRegex.matchEntire(fileName)
                ?.groupValues
                ?.getOrNull(4)
                ?: error("Could not parse filename $fileName")

            return TestName(suiteName.split('.') + testName)
        }

        fun fromFile(filename: String, suiteName: String, testName: String): TestName {
            val isJvm = Path(filename).nameWithoutExtension.startsWith("TEST-suite_")
            val finalSuiteName = if (isJvm) {
                listOfNotNull(namePlatformRegex.find(suiteName)?.groupValues[1])
            } else {
                suiteName.split('.').drop(1)
            }


            val (platform, test) = namePlatformRegex.findAll(testName).first().groupValues.run {
                get(2) to get(1)
            }

            return TestName(finalSuiteName + test + platform)
        }
    }
}