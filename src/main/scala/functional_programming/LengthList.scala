package functional_programming

import java.util.Scanner

object LengthList {

  def main(args: Array[String]): Unit = {

    val s = new Scanner(System.in)
    val n = s.nextInt()

    val list = (1 to n).toList
//    println(list)

    println(lenghtAux(list))

    // normal way
    def f(list: List[Int]): Int ={

      var count = 0;
      list.map{
        x => count+=1

      }
      count
    }

    // recursive way
//    def f2(list: List[Int]): Int={

      def lenghtAux(list: List[Int], count: Int =0): Int = {

//        println("list.head:"+list.head)
//        println("list.tail:"+list.tail)
        list match{

          case Nil => count
          case head :: tail =>

            println("head:"+head)
            println("tail:"+tail)
            println("count:"+ count)

            lenghtAux(tail, count +1)

        }
      }
//      lenghtAux(list)
//    }

  }
}
