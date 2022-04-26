class Triangle(val height: Double, val a: Double, val b: Double, val c: Double) {
  def perimeter: Double = a + b + c

  def area: Double = 0.5 * a * height
}
