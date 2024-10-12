package LC

import scala.util.control.Breaks.break

object FirstUniqueInString {

  def main(args: Array[String]): Unit = {

    val s = "loveleetcode"
    val frequency: Map[Char, Int] = s.groupBy(identity).view.mapValues(_.length).toMap
    println(frequency)

    val zipIndexString: Seq[(Char, Int)] = s.zipWithIndex
    println(zipIndexString)

    val filterRes: Option[(Char, Int)] =
      zipIndexString.find{ t =>
        frequency(t._1) == 1
    }

    val res: Int = if (filterRes.isDefined) filterRes.get._2 else -1

    println(res)

  }

}
