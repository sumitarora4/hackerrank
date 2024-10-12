package Array

//input: arr = {12, 3, 4, 1, 6, 9}, sum = 24;
//Output: 12, 3, 9

object Find3SumElements {
  def main(args: Array[String]) = {

    val arr = scala.Array(1, 4, 45, 6, 10, 8)
    val n = arr.length
    val sum = 22

    for (i<- 0 until (n-2)){
      for (j<- i + 1 until (n-1)) {
        for (k<- j +1  until n  ){
          if (arr(i) + arr(j) + arr(k) == sum){
            println(s"triplet is: ${arr(i)}, ${arr(j)} ${arr(k)}")
          }
        }
      }
    }
  }
}
