package com.imooc.scala.course08


object ImplicitClassApp extends App{


  implicit class Caculator(x:Int) {
    def add(a: Int) = a + x
  }

  println(1.add(2))
}



