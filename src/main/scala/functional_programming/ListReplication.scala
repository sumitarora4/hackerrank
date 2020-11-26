package functional_programming

object ListReplication {

  // repeat list element n times

  def f(n: Int, arr: List[Int])= {

//    val d = arr.map( x => for( i <- 1 to n ){x})
//    d
//    val d = arr.flatMap(x => List.fill(n)(x))
//    d

    // above is same as
    arr.flatMap(List.fill(n)(_))

  }
  def main(args: Array[String]): Unit = {

    val n = 3
    val arr = List(1,2,3,4)
    println(f(n: Int, arr))
  }

}
