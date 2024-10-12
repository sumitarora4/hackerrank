package functional_programming

object ComputingGCD {

  def main(args: Array[String]) : Unit = {

    val x = 22
    val y = 131
    val result = gcd(x,y)
    println(result)

  }

  def gcd(a: Int, b: Int) : Int = {

    if(b == 0) a
    else gcd(b , a % b)
  }
}


// -----------

object Solution {

  def gcd(x: Int, y: Int): Int =
  {
    // You only need to fill up this function
    // To return the value of the GCD of x and y

    if ( y == 0) x
    else
      gcd(y, x % y)

  }


  /**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
    println(gcd(pair.head,pair.reverse.head))
  }

  def main(args: Array[String]) {
    /** The part relates to the input/output. Do not change or modify it **/
    val stdin = scala.io.StdIn
    acceptInputAndComputeGCD(stdin.readLine().trim().split(" ").map(x=>x.toInt).toList)

  }
}
