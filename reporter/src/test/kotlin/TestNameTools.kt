import com.dshatz.tbreport.parse.TestName
import kotlin.test.Test
import kotlin.test.assertEquals

class TestNameTools {

    @Test
    fun `simple testcase name jvm`() {
        val n = TestName.fromFile(
            "TEST-suite_com.dshatz.tbreport.sampleTests",
            "2 plus 2[jvm]",
            "suite_com.dshatz.tbreport.sampleTests"
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
            "2 plus 2[linuxX64]",
            "linuxX64Test.sampleTests"
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

    @Test
    fun `from firebase with empty suite name`() {
        val n = TestName.fromFile(
            "test_result_1",
            "convert",
            "com.dshatz.kni.buffers.JvmBufferTest",
            platformOverride = "Android"
        )

        assertEquals(
            listOf(
                "JvmBufferTest",
            ),
            n.suitePath
        )

        assertEquals(
            "Android",
            n.platform
        )
    }
}