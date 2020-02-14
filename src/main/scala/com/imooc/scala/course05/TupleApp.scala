package com.imooc.scala.course05

/**
  * 元组 ： （。。。。。）
  */
object TupleApp extends App{

  val a = (1,2,3,4,5)

  println(a._1)
  println(a._2)

  println(a.productArity)

  for(i <- 0 until(a.productArity)) {
    println(a.productElement(i))
  }


  val hostport = ("localhost", 8080)

  println(hostport._1)
  println(hostport._2)

}
