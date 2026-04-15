package com.dshatz.tbreport.parse

@JvmInline
value class TestName private constructor(val parts: List<String>) {

    val testName: String
        get() = parts.last()

    val suitePath: List<String>
        get() = parts.dropLast(1)

    companion object {
        fun ofRaw(testName: String, suiteName: String): TestName {
            val sanitized = testName.replace("〈tb〈", "").replace("〉tb〉", "")
            val testSuiteParts = suiteName.split('↘').map { it.trim() }
            val testCaseParts = sanitized.split('↘').map { it.trim() }
            return TestName(testSuiteParts + testCaseParts)
        }
    }
}