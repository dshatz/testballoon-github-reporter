package com.dshatz.tbreport.model

data class TestSuite(
    val name: String,
    val path: List<String>,
    val cases: List<TestCase>,
    val children: List<TestSuite>
)