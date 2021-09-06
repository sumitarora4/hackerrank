package functional_programming

import java.util.Scanner

object EvaluatingEX {

  def main(arg: Array[String]): Unit= {

    val s = new Scanner(System.in)

    val n = s.nextInt()

    var list = List[Double]()
    for(i <- 1 to n){

      list = list :+ s.nextDouble()
    }
    val result = list.map{d => f(d)}

    println( result )

  }

  def f(list: Double): Double = {

    ((1 to 9).foldLeft(List(1D)) { (ls, index) =>
      println("ls= "+ls)
      println("index= "+index)
      println("index :: ls= "+index :: ls)

      ls.head * list / index :: ls
    }).sum
  }

}
