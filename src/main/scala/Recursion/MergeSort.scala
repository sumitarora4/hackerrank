package Recursion

import scala.Array

object MergeSort {

  def main(args: Array[String]) = {

    val ary = Array(4,0,1,5,2,3)
    println(ary.mkString(","))
    println(mergeSort(ary).mkString(","))

    def mergeSort(items: Array[Int]): Array[Int] = {

      if(items.length <= 1) items
      else {
        val (left, right) = items.splitAt(items.length / 2)
        val (sortedLeft, sortedRight) = (mergeSort(left), mergeSort(right))

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
}
