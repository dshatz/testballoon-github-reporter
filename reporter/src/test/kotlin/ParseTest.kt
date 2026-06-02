import com.dshatz.tbreport.parse.ParseJUnit
import com.dshatz.tbreport.util.readFile
import kotlin.test.Test

class ParseTest {

    @Test
    fun `firebase android result`() {
        val file = readFile("src/test/resources/test_result_1.xml")

        val parsed = ParseJUnit.parseFile(file, mapOf("src/test/resources/**" to "Android"))
        println(parsed)
    }
}