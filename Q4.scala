@main def hello: Unit =

  def OddEven(n: Int): String = {
    if (n == 0) {
      "Even"
    } else if (n == 1) {
      "Odd"
    } else {
      OddEven(n - 2)
    }
  }
