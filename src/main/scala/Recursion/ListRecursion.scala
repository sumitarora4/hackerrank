package Recursion

object ListRecursion {

  def main(args: Array[String]) = {

    val list = List(1, 2, 3, 4)

    //     length of the List
    println(lengthOfList(list))

    def lengthOfList(list: List[Int]): Int = {

      def lengthTailRec(remainingList: List[Int], acc: Int): Int = {
        if (remainingList.isEmpty) acc
        else {
          lengthTailRec(remainingList.tail, acc + 1)
        }
      }

      lengthTailRec(list, 0)
    }



    // reverse a list
    println(reverseList(list))

    def reverseList(list: List[Int]): List[Int] = {

      def reverseTailRec(remainingList: List[Int], acc: List[Int]): List[Int] = {
        if (remainingList.isEmpty) acc
        else {
          reverseTailRec(remainingList.tail, remainingList.head :: acc)
        }
      }

      reverseTailRec(list, Nil)
    }

    // append a list

    val otherList = List(6, 7, 8)
    println(appendAnotherList(otherList, list))

    def appendAnotherList(anotherList: List[Int], firstList: List[Int]): List[Int] = {

      def appendListTailRec(anotherList: List[Int], acc: List[Int]): List[Int] = {
        if (anotherList.isEmpty) acc
        else {
          appendListTailRec(anotherList.tail, anotherList.head :: acc)
        }

      }

      appendListTailRec(anotherList, firstList.reverse).reverse
    }



    // remove at index

    println(removeAt(3))

    def removeAt(index: Int): List[Int] = {

      def removeAtTailRec(remainingList: List[Int], result: List[Int]): List[Int] = {
        if (remainingList.isEmpty) result
        else {
          // this will remove every element at index 2 recusively
//          removeAtTailRec(remainingList.tail, remainingList.take(index) ++ remainingList.drop(index + 1))

          remainingList.take(index) ++ remainingList.drop(index + 1)
        }
      }

    removeAtTailRec(list, Nil)
    }

  }

}