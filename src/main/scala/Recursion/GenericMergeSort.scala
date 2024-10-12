package Recursion

import scala.Array

object GenericMergeSort {

  def main(args: Array[String]) = {

    val ary = Array(4, 0, 1, 5, 2, 3)
    val strAry = Array("u", "a", "d", "g")

    println(ary.mkString(","))
    println(mergeSort(ary).mkString(","))
    println(mergeSort(strAry).mkString(","))

    def mergeSort[T: Ordering](items: IndexedSeq[T]): IndexedSeq[T] = {

      if (items.length <= 1) items
      else {
        // divide array into two partition
        val (left, right) = items.splitAt(items.length / 2)
        val (sortedLeft, sortedRight) = (mergeSort(left), mergeSort(right))

        // now merge two sorted arrays
        var (leftIdx, rightIdx) = (0, 0)
        val output = IndexedSeq.newBuilder[T]

        while (leftIdx < sortedLeft.length || rightIdx < sortedRight.length) {

          val takeLeft = (leftIdx < sortedLeft.length, rightIdx < sortedRight.length) match {
            case (true, false) => true
            case (false, true) => false
            case (true, true) => Ordering[T].lt(sortedLeft(leftIdx), sortedRight(rightIdx))
          }

          if (takeLeft) {
            output += sortedLeft(leftIdx)
            leftIdx += 1
          }
          else {
            output += sortedRight(rightIdx)
            rightIdx += 1
          }

        }

        output.result()
      }
    }
  }
}
