package LC
import scala.collection.mutable.PriorityQueue
import scala.math.ceil
import scala.Array
import scala.collection.mutable
import scala.collection.mutable.PriorityQueue
import scala.math.ceil

object MinimizeSum {
  def minimizeSum(array: Array[Int], k: Int): Int = {
    // Create a max-heap (using a min-heap with inverted values)
    val maxHeap = mutable.PriorityQueue.empty[Int](Ordering[Int].reverse)

    // Enqueue all elements of the array
    maxHeap.enqueue(array: _*)

    // Perform k operations
    for (_ <- 1 to k) {
      if (maxHeap.nonEmpty) {
        // Remove the largest element
        val maxElement = maxHeap.dequeue()
        // Calculate the new value (ceiling of half)
        val newValue = ceil(maxElement / 2.0).toInt
        // Insert the new value back into the heap
        maxHeap.enqueue(newValue)
      }
    }

    // Calculate the final sum
    maxHeap.sum
  }

  def main(args: Array[String]): Unit = {
    val array = Array(10, 20, 7)
    val k = 3
    val result = minimizeSum(array, k)
    println(result)  // Output the minimized sum
  }
}
