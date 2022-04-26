import org.scalatest._
import flatspec._
import matchers._


class SquareSpec extends AnyFlatSpec with should.Matchers {
  "Square" should "have a sides" in {
    val square = new Square(2)
    square.a shouldBe 2
  }

  it should "have perimeter, according to input parameter" in {
    val square = new Square(2)
    square.perimeter shouldBe 8
  }

  it should "have area, according to input parameter" in {
    val square = new Square(2)
    square.area shouldBe 4
  }
}