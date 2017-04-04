package com.github.trod

object Basics {
  val s = Seq(1, 2, 3, 0, 3, 5, 4)

  def iteratorFindMax(): Unit = {
    print(s"* Find max of ${s}: ")

    val it = s.iterator
    val max = it.max

    print(s"max = ${max}")
    println
  }

  def iteratorTraverse(): Unit = {
    print(s"* Traverse ${s}: ")
    val it = s.iterator

    while (it.hasNext) {
      print(s"${it.next} ")
    }
    println
  }

  /** `grouped` will return fixed-size `Iterable` chucks of an `Iterable`:* */
  def iteratorGroupedTraverse(): Unit = {
    print(s"* Grouped Traverse ${s}: ")
    val it = s grouped 2

    while (it.hasNext) {
      print(s"${it.next} ")
    }
    println
  }

  def iteratorSlidingTraverse(): Unit = {
    print(s"* Sliding Traverse ${s}: ")
    val it = s sliding (2,1)  // or just sliding 2, where 2 is a sice of chunk

    while (it.hasNext) {
      print(s"${it.next} ")
    }
    println
  }

  def iteratorTakeRight(): Unit = {
    val it = s.iterator
    print(s"* Taking right element ${s}: ")
    print(s"\nit.take(3): ${it.take(3)}")
    print(s"\ns takeRight(3): ${s takeRight(3)}")
    println

  }

  def main(args: Array[String]) {
    iteratorTraverse()
    iteratorGroupedTraverse()
    iteratorSlidingTraverse()
    iteratorFindMax()
    iteratorTakeRight()
  }
}
