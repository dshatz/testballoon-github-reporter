package com.dshatz.tbreport.model

import com.dshatz.tbreport.junit.Failure
import kotlin.time.Duration

data class TestCase(
    val suitePath: List<String>,
    val name: String,
    val platform: String,
    val runner: String? = null,
    val pass: Boolean,
    val time: Duration,
    val className: String,
    val failure: Failure?
)