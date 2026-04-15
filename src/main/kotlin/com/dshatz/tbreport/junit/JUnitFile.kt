package com.dshatz.tbreport.junit

import com.dshatz.tbreport.parse.InstantSerializerZ
import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlSerialName
import kotlin.time.Instant

@Serializable
@XmlSerialName("testsuite")
data class JUnitFile(
    val name: String,
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