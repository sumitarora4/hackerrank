package Recursion

import java.util.Scanner
import scala.Array

object MergeTwoSortedList_v2 {

  def main(args: Array[String]) = {

    val s = new Scanner(System.in)

//    val sortedLeftChar = s.nextLine().toCharArray
//    println(sortedLeftChar.mkString(","))
//    val sortedLeft = sortedLeftChar.map(l => l.toInt)

//    val sortedLeft
//    println(sortedLeft.mkString(","))

//    val sortedRightChar = s.nextLine().toCharArray
//    val sortedRight = sortedRightChar.map(l => l.toInt)
//    println(sortedRight.mkString(","))

    val sortedLeft = Array(1,2,3,4,5)
    val sortedRight = Array(7,8,9,10)

    println(mergeTwoSort(sortedLeft,sortedRight).mkString(","))

    def mergeTwoSort(sortedLeft: Array[Int], sortedRight: Array[Int]) = {
      // merge two sorted arrays
      // index
      var (leftIdx , rightIdx) = (0,0)
      val output = Array.newBuilder[Int]

      while(leftIdx < sortedLeft.length || rightIdx < sortedRight.length){

        val takeLeft = (leftIdx < sortedLeft.length, rightIdx < sortedRight.length ) match {
          case (true, false) => true
          case (false, true) => false
          case (true, true) => sortedLeft(leftIdx) < sortedRight(rightIdx)
        }

        if (takeLeft) {
          output+= sortedLeft(leftIdx)
          leftIdx +=1
        }
        else {
          output+= sortedRight(rightIdx)
          rightIdx +=1
        }

      }
      output.result()
    }
  }

}
