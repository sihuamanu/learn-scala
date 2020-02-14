package com.imooc.scala.course07


object StringApp extends App{

  //val s = "hello"
  val name = "PK"
  val team = "AC Milan"

  //println(s + name)

  println(s"Hello: $name")
  println(s"Hello: $name, Welcom to $team")


  val b =
    s"""
      |这是一个多行
      |字符串
      |Haha $name
      |来吧 $team
    """.stripMargin

  println(b)
}


