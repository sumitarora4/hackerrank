package LC
import java.util.Scanner
import scala.Array

// complete solution to take STDIN and print STDOUT for hackerRank
object Soution {

  def main(args: Array[String]): Unit = {

    // Read all inputs from STDIN. Print output to STDOUT.
    val s = new Scanner(System.in)

    // input for initializing array size
    val n = s.nextInt()

    // initialized array
    val arr = new Array[Int](n)

    // iterate till n-1 to add values in array from STDIN
    for (i <- 0 to n-1) {
      arr(i) = s.nextInt()
    }

    // result in STDOUT
    println(rob(arr))

    // logic implementation
    def rob(nums: Array[Int]): Int = {
     val res = nums.foldLeft(0,0){
        case ((prevAmount, maxAmount), number) => (maxAmount, Math.max(maxAmount, prevAmount + number))

      }
    println(res)
    res._2

    }


  }
}
