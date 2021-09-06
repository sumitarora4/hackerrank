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
