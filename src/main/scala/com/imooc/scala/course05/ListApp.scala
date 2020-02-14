package com.imooc.scala.course05


object ListApp extends App{

  val l = List(1,2,3,4,5)

  val l5 = scala.collection.mutable.ListBuffer[Int]()

  l5 += 2

  l5 += (3,4,5)

  l5 ++= List(6,7,8,9)

  l5 -= (1,4)

  l5 -= 2

  l5 --= List(5,6,7,8)

  l5.insert(0, 4)

  println(l5.isEmpty)

  println(l5)

  def sum(nums:Int*): Int ={
    if(nums.length == 0) {
      0
    } else {
      nums.head + sum(nums.tail:_*)
    }
  }

  println(sum(1,2,3,4))

}
