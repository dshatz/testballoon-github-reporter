import com.dshatz.tbreport.model.TestCase
import com.dshatz.tbreport.parse.ParseJUnit
import com.dshatz.tbreport.util.readFile
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.Duration

class TestParse {

    @Test
    fun `parse simple`() {
        val junit = readFile("test-results/jvmTest/TEST-com.dshatz.pdfmp.rendererTests.xml")

        assertEquals(4, junit.tests)

        val result = ParseJUnit.parseFile(junit)
        println(result)
    }

    @Test
    fun `merge hierarchy`() {
        val junit = ParseJUnit.parseFile(readFile("test-results/jvmTest/TEST-com.dshatz.pdfmp.rendererTests.xml"))
        println(ParseJUnit.mergeHierarchy(junit))
    }

    private fun makeTestCase(
        vararg segments: String
    ) = TestCase(
        suitePath = segments.dropLast(1),
        name = segments.last(),
        platform = "",
        pass = true,
        time = Duration.ZERO,
        className = "",
        failure = null
    )
}