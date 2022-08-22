@main def hello: Unit =

  def GCD(a: Int, b: Int): Int = b match {
    case 0            => a
    case b if (b > a) => GCD(b, a)
    case _            => GCD(b, a % b)
  }

  def isPrimeOrNot(n: Int, i: Int): Boolean = n match {

    case n if n == i        => true
    case n if GCD(n, i) > 1 => false
    case x                  => isPrimeOrNot(n, i + 1)

  }

  print("Enter a number: ")
  var number = scala.io.StdIn.readInt()
  println(isPrimeOrNot(number, 2))
