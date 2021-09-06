package functional_programming

import java.util.Scanner

object FibonacciNumbers {

  def main(args: Array[String]): Unit = {

    val s = new Scanner(System.in)
    val n = s.nextInt()
    print(fibonacci2(n))

  }

  //   1) normal recursion but this will work only when n is small
  //   for bigger number this will take too much time or
  //    stackoverflow exception generates

  def fibonacci(n: Int): Int = {

    n match {
      case 0 | 1 => n
      case _ => fibonacci(n - 1) + fibonacci(n - 2)
    }
  }


  // 2) using tail recursion
  // for compiler tail recursion is easier to convert into loops
  // and it will take very less time

  def fibonacci2(n: Int): Int = {
    def fibonacci_tail(n: Int, b: Int, a: Int): Int =

      n match {
        case 0 => a
        case _ => fibonacci_tail(n - 1, b, a + b )
      }

    fibonacci_tail(n, 1, 0)

  }

}