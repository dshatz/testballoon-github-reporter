package com.dshatz.tbreport

import de.infix.testBalloon.framework.core.testSuite
import io.kotest.matchers.shouldBe

val sampleTests by testSuite() {
    /*test("2 plus 2") {
        (2 + 2) shouldBe 4
    }*/

    test("Failure") {
        error("Simulated failure")
    }

    testSuite("nested") {
        test("pass in nested") {
            "1234".toInt() shouldBe 1234
        }
    }
}