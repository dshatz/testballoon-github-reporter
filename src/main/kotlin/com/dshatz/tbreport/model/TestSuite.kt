package com.dshatz.tbreport.model

import kotlinx.serialization.Serializable

@Serializable
data class TestSuite(
    val name: String,
    val path: List<String>,
    val cases: List<TestCase>,
    val children: List<TestSuite>
)

fun List<TestSuite>.countTotal(): Int {
    return sumOf { it.cases.size }
}

fun List<TestSuite>.countSuccessful(): Int {
    return sumOf { it.cases.count { case -> case.pass } }
}