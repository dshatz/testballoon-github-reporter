package com.dshatz.tbreport.github

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CheckRun(
    val name: String,
    @SerialName("head_sha") val sha: String,
    val status: String,
    val conclusion: String
)