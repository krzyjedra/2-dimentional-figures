import org.scalatest._
import flatspec._
import matchers._


class CircleSpec extends AnyFlatSpec with should.Matchers {
  "Circle" should "have a radius" in {
    val circle = new Circle(2)
    circle.r shouldBe 2
  }

  it should "have perimeter, according to input parameter" in {
    val circle = new Circle(2)
    circle.perimeter shouldBe 12.56
  }

  it should "have area, according to input parameter" in {
    val circle = new Circle(2)
    circle.area shouldBe 12.56
  }
}