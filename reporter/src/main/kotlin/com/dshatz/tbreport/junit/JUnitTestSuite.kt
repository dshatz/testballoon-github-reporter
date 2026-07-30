package com.dshatz.tbreport.junit

import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlSerialName

@Serializable
@XmlSerialName("testsuites")
data class AndroidJunitFile(
    val suites: List<JUnitTestSuite>
)

@Serializable
@XmlSerialName("testsuite")
data class JUnitTestSuite(
    @XmlSerialName("name") val suiteName: String,
    val tests: Int,
    val failures: Int,
    val time: Double,
    val skipped: Int,
    val errors: Int,
    val hostname: String,
    val testCases: List<JUnitTestCase>,
    val runner: String? = null,
    val fileName: String = ""
)