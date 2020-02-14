package com.imooc.scala.course05


object ArrayApp extends App{
  println("test")

 /* val a = new Array[String](5)

  a(1) = "hello"
  println(a)
  println(a.length)

  val b = Array("hadoop", "spark", "storm")

  val c = Array(2,3,4,5,6,7,8,9)
  c.sum
  c.max
  c.min
  c.mkString("<", ",", ">")*/


  val d = scala.collection.mutable.ArrayBuffer[Int]()

  d += 1

  d += 2

  d += (3,4,5)

  d ++= Array(6,7,8)

  d.insert(0, 0)

  d.remove(1)

  d.remove(0, 3)

  d.trimEnd(2)

  /*for(i <- 0 until d.length) {
    println(d(i))
  }*/

  for(ele <- d) {
    println(ele)
  }

  for(i <- (0 until d.length).reverse) {
    println(d(i))
  }
  println(d)
}
