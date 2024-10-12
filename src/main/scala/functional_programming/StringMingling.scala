package functional_programming

import java.util.Scanner

object StringMingling {

  def main(args: Array[String]): Unit = {


    // 1) First Approach
    val s = new Scanner(System.in)

    // convert string to list of character
    val p1 = s.nextLine().toList
    val q1 = s.nextLine().toList

    // zip is used to merge two collections or list/seq into single collection or list
    val fr = p1.zip(q1)

    // flatten the list of tuple of characters List[(Char, Char)] to list of character List[Char, Char]
    // mkString is to convert the list of char to comma separated char
    println("result=="+fr.flatten{case(a,b) => List(a,b)}.mkString(""))


    // 2) Second  Approach
    // this approach is not working as it will merge every character of String to every character of second string
    /*  var r: String = ""
    p1.map{ p => p
      q1.map{ q => q
        r +=  p.toString + q.toString
      }
    }
    println("result ="+r)*/

    // 3) third approach
    // take 2 input from stdin and store this to List(input)
    val List(p, q) = scala.io.Source.stdin.getLines.take(2).toList
    println("input = "+List(p,q))

    // 
    val zipRes = (p, q).zipped
    println("zipRes = "+zipRes)

    val dd = zipRes.flatMap(List(_, _))
    print("finalRes ="+dd)


  }

}
