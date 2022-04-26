import org.scalatest._
import flatspec._
import matchers._


class RectangleSpec extends AnyFlatSpec with should.Matchers {
  "Rectangle" should "have shorter sides" in {
    val rectangle = Rectangle(2, 4)
    rectangle.a shouldBe 2
  }

  it should "have longer sides" in {
    val rectangle = Rectangle(2, 4)
    rectangle.b shouldBe 4
  }

  it should "have perimeter, according to input parameters" in {
    val rectangle = Rectangle(2, 4)
    rectangle.perimeter shouldBe 12
  }

  it should "have area, according to input parameters" in {
    val rectangle = Rectangle(2, 4)
    rectangle.area shouldBe 8
  }
}