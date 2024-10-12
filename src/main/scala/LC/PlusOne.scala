package LC
import scala.Array

object PlusOne {

  def main(args: Array[String]) = {

//    val ary = Array(1,2,3)
//    val str = ary.mkString
//
//    println(str)
//
//    val res: Int = str.toInt +1
//
//    println(res.toString.toArray.mkString(","))


     val digits = Array(1,2,3)
     val str1 = digits.mkString
    println(str1)

    val res1 = BigInt(str1) +1
    println(res1)

    val dig: IndexedSeq[Int] = res1.toString.map(_.asDigit)
    println(dig)

    val res2: Array[Int] = dig.toArray
    println(res2)
  }
}
