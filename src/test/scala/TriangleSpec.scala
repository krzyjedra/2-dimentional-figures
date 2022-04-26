import org.scalatest._
import flatspec._
import matchers._


class TriangleSpec extends AnyFlatSpec with should.Matchers {
  "Triangle" should "have a height" in {
    val triangle = new Triangle(2, 1, 3, 6)
    triangle.height shouldBe 2
  }

  it should "have three side and the first one is a" in {
    val triangle = new Triangle(2, 1, 3, 6)
    triangle.a shouldBe 1
  }

  it should "have three side and the second one is b" in {
    val triangle = new Triangle(2, 1, 3, 6)
    triangle.b shouldBe 3
  }

  it should "have three side and the third one is c" in {
    val triangle = new Triangle(2, 1, 3, 6)
    triangle.c shouldBe 6
  }

  it should "have perimeter, according to input parameters" in {
    val triangle = new Triangle(2, 1, 3, 6)
    triangle.perimeter shouldBe 10
  }
  it should "have area, according to input parameters" in {
    val triangle = new Triangle(2, 1, 3, 6)
    triangle.area shouldBe 1
  }

}
