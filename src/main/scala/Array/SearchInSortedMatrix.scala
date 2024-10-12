package Array

object SearchInSortedMatrix {

  def main(args: Array[String]): Unit = {
    val mat: Array[Array[Int]] = scala.Array(
      scala.Array(10, 20, 30, 40),
      scala.Array(15, 25, 35, 45),
      scala.Array(27, 29, 37, 48),
      scala.Array(32, 33, 39, 50)
    )

    // Function call
    search(mat, 4, 100)

    def search(mat: Array[Array[Int]], n: Int, x: Int): Int = {
      if (n == 0) -1
      // traverse through the matrix
      for (i <- 0 until n) {
        for (j <- 0 until n) { // if the element is found
          if (mat(i)(j) == x) {
            System.out.print("Element found at (" + i + ", " + j + ")\n")
              1
          }
        }
      }
      System.out.print(" Element not found")
      0
    }
  }

}
