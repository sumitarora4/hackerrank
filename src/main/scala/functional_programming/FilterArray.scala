package functional_programming

object FilterArray {

  /*def f(delim:Int,arr:List[Int]) =
  {
    arr.filter(x  => x < delim)
  }*/

  def f(delim: Int,arr: List[Int]): List[Int] = {
    def filter[T](p: T => Boolean, arr: List[T]): List[T] = arr match {
      case Nil => Nil
      case head :: tail =>
        if (p(head)) head :: filter(p, tail) else filter(p, tail)
    }
    filter[Int](_ < delim, arr)
  }


  def main(args: Array[String]): Unit = {

    val n = 3
    val arr = List(3,4,2,0,23,1,342,23,44)

    println(f(n, arr))
  }

}
