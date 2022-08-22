import scala.io.StdIn._

@main def hello: Unit =

  def fibonacci(n: Int): Int = n match {
    case x if x == 0 => 0
    case x if x == 1 => 1
    case x           => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibonacciSeqeunce(n: Int): Unit = {
    if (n > 0) {
      fibonacciSeqeunce(n - 1);
    }
    println(fibonacci(n));
  }

  print("Enter a Number: ");
  var num = readInt();

  println(fibonacciSeqeunce(num));
