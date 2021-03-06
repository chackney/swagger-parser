import io.swagger.parser.{Swagger20Parser, SwaggerParser}
import io.swagger.util.Json
import org.scalatest.{FlatSpec, Matchers}

class SwaggerParserExtensionTest extends FlatSpec with Matchers {
  val m = Json.mapper()

  it should "verify the default parser extension" in {
    val parser = new SwaggerParser()
    val extensions = parser.getExtensions()
    extensions.size should be > (0)
    extensions.get(0).getClass should be(classOf[Swagger20Parser])
  }
}