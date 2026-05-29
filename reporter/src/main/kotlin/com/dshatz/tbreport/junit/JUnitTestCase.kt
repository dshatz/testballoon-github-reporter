package com.dshatz.tbreport.junit

import com.dshatz.tbreport.parse.DurationSerializerS
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlSerialName
import kotlin.time.Duration

@Serializable
@XmlSerialName("testcase")
data class JUnitTestCase(
    val name: String,
    @SerialName("classname") val className: String,
    @Serializable(DurationSerializerS::class) val time: Duration,
    val failure: Failure?
)