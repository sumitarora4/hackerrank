//https://www.hackerrank.com/challenges/area-under-curves-and-volume-of-revolving-a-curv/problem

package functional_programming.introduction

object AreaUnderCurve {

  def main(args: Array[String]): Unit = {

    val step = 0.001
    val cofficient = List(1,2,3,4,5)
    val power = List(6,7,8,9,10)

    def area(cofficient: List[Int], power: List[Int], x: Double) : Double = {
      val r = f( cofficient , power, x )
      math.Pi * r * r
    }

    def f(cofficient: List[Int], power: List[Int], x : Double ): Double = {
      val res = cofficient.zip(power).map{
        case(c, p) => c * math.pow(x, p)
      }
      res.sum
    }

    def summation(f:(List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int,
                  cofficient: List[Int], power: List[Int]): Double ={

       val res = (BigDecimal(lowerLimit) to upperLimit by step).map{

         x => f(cofficient, power, x.toDouble)
       }
      res.sum * step
    }


  }

}
