package LC
import scala.collection.immutable.LazyList

object FindChild {
  def main(args: Array[String]) = {

    val n = 3
    val k = 5

    println(numberOfChild_v2(n,k))

    def numberOfChild(n: Int, k: Int): Int = {
      def stream: LazyList[Int] =
        LazyList.from(0.until(n) ++ (n - 2).until(0, -1)) #::: stream
      stream(k)
    }


//    val children = 3
//    var time = 5
//
    def numberOfChild_v2(n: Int, k: Int) = {

      (n-1) - Math.abs((n-1) - k % (2*(n-1)))

      }
//
//    }

  }

}
