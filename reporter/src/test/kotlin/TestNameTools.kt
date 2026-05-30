import com.dshatz.tbreport.parse.TestName
import kotlin.test.Test
import kotlin.test.assertEquals

class TestNameTools {

    @Test
    fun `simple testcase name jvm`() {
        val n = TestName.fromFile(
            "TEST-suite_com.dshatz.tbreport.sampleTests",
            "sampleTests[jvm]",
            "2 plus 2[jvm]"
        )
        assertEquals(
            "2 plus 2",
            n.testName
        )

        assertEquals(
            listOf(
                "sampleTests",
            ),
            n.suitePath
        )

        assertEquals(
            "jvm",
            n.platform
        )
    }

    @Test
    fun `testcase name linux`() {
        val n = TestName.fromFile(
            "TEST-linuxX64Test.sampleTests",
            "linuxX64Test.sampleTests",
            "2 plus 2[linuxX64]"
        )
        assertEquals(
            "2 plus 2",
            n.testName
        )

        assertEquals(
            listOf(
                "sampleTests",
            ),
            n.suitePath
        )

        assertEquals(
            "linuxX64",
            n.platform
        )
    }
}