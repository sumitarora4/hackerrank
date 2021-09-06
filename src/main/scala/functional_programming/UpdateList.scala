package functional_programming

import java.util.Scanner

object UpdateList {

  def main(arr: Array[String]): Unit ={

    val s = new Scanner(System.in)
    val n = s.nextInt()

    //    val list = scala.collection.mutable.MutableList[Int]()
    var list = List[Int]()

    for(i <- 1 to n ){
      list = list:+ s.nextInt()
    }

    println(f(list))


  }


  def f(arr:List[Int]):List[Int] ={

    val result = arr.map{f => if(f < 0) f * -1 else f}
    result
  }
}
