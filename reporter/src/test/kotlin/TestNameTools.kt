import com.dshatz.tbreport.parse.TestName
import kotlin.test.Test
import kotlin.test.assertEquals

class TestNameTools {

    @Test
    fun `simple testcase name`() {
        val n = TestName.ofRaw(
            "get page count",
            "TestSession ↘ @Default ↘ rendererTests",
            "linuxX64"
        )
        assertEquals(
            "get page count",
            n.testName
        )

        assertEquals(
            listOf(
                "TestSession",
                "@Default",
                "rendererTests",
            ),
            n.suitePath
        )
    }

    @Test
    fun `nested testcase name`() {
        val n = TestName.ofRaw(
            "rendering ↘ render one whole page",
            "TestSession ↘ @Default ↘ rendererTests",
            "linuxX64"
        )
        assertEquals(
            "render one whole page",
            n.testName
        )

        assertEquals(
            listOf(
                "TestSession",
                "@Default",
                "rendererTests",
                "rendering"
            ),
            n.suitePath
        )
    }
}