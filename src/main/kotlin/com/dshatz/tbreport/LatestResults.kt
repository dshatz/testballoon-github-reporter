package com.dshatz.tbreport

import com.dshatz.tbreport.model.TestSuite
import kotlinx.serialization.Serializable

@Serializable
data class LatestResults(
    val suites: List<TestSuite>
)