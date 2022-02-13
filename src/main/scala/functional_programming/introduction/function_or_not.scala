package functional_programming.introduction

import java.util.Scanner

/*

a valid function is that which for a given input, ALWAYS gives the same output.

VALID Function
Given a function f() that functions as:

  f(1)=1
  f(2)=2
  f(3)=3
  f(2)=2
  f(4)=1000
  It is considered VALID, as outputs are always in a 1:1 relation with inputs, even although we don't know the exact way the relationship (function) works (i.e. we got no idea how f(4) gives 1000).

  INVALID Function
  A function g() which functions as follows:

  g(1)=1
  g(2)=333
  g(3)=89
  g(2)=777
  g(4)=1000
  The above function g, is NOT VALID, since, for input 2, we get two different results, first 333, then later we get 777.

  NOTE : It is worth noting that multiple inputs may give the same output:

  f(1)=99
  f(2)=99
  f(3)=99
  Would still be a valid function.
*/

object function_or_not {

  def main(args: Array[String]): Unit = {

    val sc = new Scanner(System.in)
    val test = sc.nextInt()

    (0 until test).foreach{ _ =>
      val n = sc.nextInt()

      val number = (0 until n).map{  _ =>
        (sc.nextInt(), sc.nextInt())
      }.groupBy(_._1)

//      println(number)

    /* val numberExist =  number.map { case (_, list) =>

//       println( list.map(_._2).toSet)

       list.map(_._2).toSet.size }
      println(numberExist)*/

      if (number.exists{ case (_, list) => list.map(_._2).toSet.size > 1 } )
        println( "NO")
      else
        println("YES")
    }

  }


}
