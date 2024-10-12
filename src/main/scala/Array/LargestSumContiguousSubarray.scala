package Array


// Kadane Algorithm
object LargestSumContiguousSubarray {

  def main(args: Array[String]): Unit = {

    val a = scala.Array(-2, -3, 4, -1, -2, 1, 5, -3)
    println("Maximum contiguous sum is " + maxSubArraySum(a))

    // Function Call// Function Call

    def maxSubArraySum(a: Array[Int]) = {
      val size = a.length
      var max_so_far = Integer.MIN_VALUE
      var max_ending_here = 0
      for (i <- 0 until size) {
        max_ending_here = max_ending_here + a(i)
        if (max_so_far < max_ending_here) max_so_far = max_ending_here
        if (max_ending_here < 0) max_ending_here = 0
      }
      max_so_far
    }
  }

}
