package functional_programming

object FilterPositionsinList {


  def f(list: List[Int])= {

    //1- first Solution
    // this will add index with every element in tuple format
    val addIndexWithElements = list.zipWithIndex

    // filter those tuple whose index value is odd
    val filterOddElements = addIndexWithElements.filter(x => x._2 % 2 !=0)

    // fetch only value from tuple which is the first value
    val fetchOnlyValuesFromTuple = filterOddElements.map(x => x._1)

    fetchOnlyValuesFromTuple

    // syntax sugar
    list.zipWithIndex.filter(_._2 % 2 !=0).map(_._1)


    //2- Second solution:
    //    whenever you have a filter followed by a map, you can combine them using collect
    list.zipWithIndex.collect{case (value,index) if index % 2 == 1 => value}


    //3- Third solution:

    //delete zeroth position value from list
    val deleteRightElement = list.drop(1)
    println(deleteRightElement)

    // sliding(size, step) means 1 step and size 2 that is skipping one element
    val IteratorList = deleteRightElement.sliding(1,2).toList
    println(IteratorList)

    // converting List of List to only list of all elements
    IteratorList.flatten

    // syntax sugar:
    list.drop(1).sliding(1,2).toList.flatten


    //4- Fourth Solution:
    //> oddFruits  : Iterator[String] = non-empty iterator
    val oddFruitsIterator = Iterator.from(1, 2).takeWhile(_ < list.size).map(list(_))

    oddFruitsIterator.toList

  }
  def main(args: Array[String]): Unit={

    val list = List(2,5,3,4,6,7,9,8)

    println(f(list))
  }

}
