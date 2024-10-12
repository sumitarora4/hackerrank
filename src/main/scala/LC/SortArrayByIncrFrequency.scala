package LC
import scala.Array
import scala.collection.mutable.ListBuffer

object SortArrayByIncrFrequency {

  def main(args: Array[String]) = {

    val ary = Array(1,1,2,2,2,3,3,3)

    val frequencyMap = ary.groupBy(identity).view.mapValues(_.size).toMap
    println(frequencyMap)

    val sortedSeq: Seq[(Int, Int)] = frequencyMap.toSeq.sortWith{
      case ((num1, freq1), (num2, freq2)) => if (freq1!= freq2) freq1 < freq2 else num1 > num2
    }
    println(sortedSeq)

    val res = ListBuffer[Int]()
    for ((num, freq) <- sortedSeq){
      for (i <- 0 until freq) {
        res += num
      }
    }
   println( res.toArray.mkString(",") )

  }

}
