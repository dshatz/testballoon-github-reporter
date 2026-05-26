package com.dshatz.tbreport.parse

@JvmInline
value class TestName private constructor(val parts: List<String>) {

    val testName: String
        get() = parts.last()

    val suitePath: List<String>
        get() = parts.dropLast(1)

    companion object {
        fun ofRaw(testName: String, suiteName: String, platform: String?): TestName {
            val sanitized = testName.replace("〈tb〈", "").replace("〉tb〉", "")
            val testSuiteParts = suiteName.split('↘', '.').map { it.trim() }
            val testCaseParts = sanitized.split('↘', '.').map { it.trim() }
            val expectedPrefix = platform?.let { "${it}Test" }
            val withoutPlatformPrefix = if (testSuiteParts.first() == expectedPrefix) {
                testSuiteParts.drop(1)
            } else testSuiteParts
            return TestName(withoutPlatformPrefix + testCaseParts)
        }
    }
}