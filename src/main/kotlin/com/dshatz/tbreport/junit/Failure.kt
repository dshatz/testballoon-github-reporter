package com.dshatz.tbreport.junit

import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlSerialName
import nl.adaptivity.xmlutil.serialization.XmlValue

@Serializable
@XmlSerialName("failure")
data class Failure(
    val message: String = "",
    val type: String = "",
    @XmlValue
    val stackTrace: String? = null
)