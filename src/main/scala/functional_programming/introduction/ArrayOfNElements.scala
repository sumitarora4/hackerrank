package functional_programming.introduction

import java.util.Scanner

object ArrayOfNElements extends App {

  val s = new Scanner(System.in)
  val n = s.nextInt()
  val arr = new Array[Int](n)

  for (i <- 0 to n - 1) {
    arr(i) = i
  }

  arr.map(x => println(x))

  /**
    * if list is taken instead of Array
    */
  println(f(n: Int))

  def f(n: Int): List[Int] = {
    var list = List[Int](n)

    for (i <- 0 to n - 1) {
      list = list :+ i
    }
    list
  }

  /**
    * syntax sugar
    */
  def f1(n: Int): List[Int] = {
    val dd = (0 to n - 1).toList
    dd
  }

}
