package functional_programming

import java.util.Scanner

object ReverseAList {

  def main(args: Array[String]): Unit = {

    val s = new Scanner(System.in)
    val n = s.nextInt()

    // one way is put elements in a list
    var list = List[Int](n)
    for (i <- 1 to n) {
      list = list :+ i
    }

    // second way is converting range to list
    // which is I think more accurate way as storing elements in immutable variable
    val list2 = (1 to n).toList

    println(f(list2))

    def f(list: List[Int]): List[Int] = {
      def reverseAux(list: List[Int], acc: List[Int]): List[Int] = {

        list match {
          case Nil => acc
          case head :: tail => reverseAux(tail, head :: acc)
        }
      }
      reverseAux(list, Nil)
    }
  }

}