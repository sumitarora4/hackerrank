package functional_programming

import java.util.Scanner

object SumOfOddElements {

  def main(args: Array[String]): Unit = {

    val s = new Scanner(System.in)
    val n = s.nextInt()

//    val list = (1 to n).toList


    var list = List[Int]()

    println("list="+list)
    for (i <- 1 to n) {
       list = list :+ s.nextInt()
    }


    println("list="+list)
    println(f(list))
  }

  def f(arr:List[Int]):Int ={

   val sum =  arr.filter{f => f % 2 !=0}.sum
//    println("sum="+sum)
    sum
  }
}
