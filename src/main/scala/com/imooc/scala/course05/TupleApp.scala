package com.imooc.scala.course05

/**
  * 元组 ： （。。。。。）
  */
object TupleApp extends App{

  val a = (1,2,3,4,5)

  a._1
  a._2

  for(i <- 0 until(a.productArity)) {
    println(a.productElement(i))
  }


  val hostport = ("localhost", 8080)

  hostport._1
  hostport._2

}
