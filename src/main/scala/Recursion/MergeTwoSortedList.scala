/*
package Recursion

object MergeTwoSortedList {

  def main(args: Array[String]) = {

//    val list1 = new ListNode(1,2,4)
//    val list2 = [1,3,4]

    // Int type
    class ListNode(_x: Int = 0, _next: ListNode = null) {
      var value: Int = _x
      var next: ListNode = _next
    }

//    val l1 =  new ListNode(3, null)
//    val l2 = new ListNode(2, null)

    val l1 = List(1,2,3)
//    var l3 = ListNode(3)
//    var l4 = ListNode(4)

//    println(mergeTwoLists(l1, l2))


    // generic
//     case class ListNode[T](_x: T = 0, _next: ListNode[T] = null) {
//       var x: T = _x
//       var next: ListNode[T] = _next
//      }



    // with Option
//        class ListNode[Int](value: Int, nt: Option[ListNode[Int]] = None) {
//      var next = nt
////      val valu = value
//    }
//
//    object ListNode {
//      def apply(value: Int, nt: Option[ListNode[Int]] = None) = new ListNode[Int](value, nt)
//    }

    def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {

      if (list1 == null)
        list2
        if (list2 == null)
        list1

        if (list1.value < list2.value) {
          list1.next = mergeTwoLists(list1.next, list2)
          list1
        }
        else {
          list2.next = mergeTwoLists(list1, list2.next)
          list2
        }
      }
    }

//    def mergeTwoLists2(list1: List[Int], list2: List[Int]): List[Int] = {
//
//      if(!list1.isEmpty && !list2.isEmpty){
//        list1.map{ l1 => list2.map{
//          l2 =>
//
//            if(l1 < l2){
//            l1 = mergeTwoLists(l1, list2)
//            list1
//          }
//          else{
//            list2.next = mergeTwoLists(list1, list2.next)
//            list2
//          }
//        }
//
//        }
//
//      }
//      if(list1 == null)
//        list2
//      list1
//    }

  }
}
*/
