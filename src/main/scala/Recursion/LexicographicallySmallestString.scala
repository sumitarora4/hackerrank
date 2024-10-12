package Recursion

import scala.annotation.tailrec

object LexicographicallySmallestString {

  def main(args: Array[String]): Unit = {

    val str = "cbabc"
    val strList:List[Char] = str.toList
    println(smallestString(str))

    def smallestString(s: String): String = {

      @tailrec
      def pre(prev: Char, chars: List[Char], acc: List[Char]): List[Char] = {

        (prev, chars) match {
          case ('a', Nil) => ('z' :: acc). reverse
          case ('a', c :: tail) => pre(c, tail, 'a':: tail)
          case _ => post(prev :: chars, acc)
        }
      }

      @tailrec
      def post(chars: List[Char], acc: List[Char]): List[Char] = {
        chars match{
          case Nil => acc.reverse
          case 'a' :: tail =>  acc.reverse ++ chars
          case c :: tail => post(tail, (c -1 ).toChar :: acc)
        }

      }

      pre(s.head, strList.tail, List.empty).mkString
    }
  }

}
