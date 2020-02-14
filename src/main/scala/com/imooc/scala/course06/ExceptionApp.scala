package com.imooc.scala.course06

/**
  * Created by sihua.ancloudera.com on 2020/1/29.
  */
object ExceptionApp extends App {




  //IO

  val file = "text.txt"


  try {

    // open file
    // use file
    val i = 10 / 0

    println(i)
  } catch {
    case e: ArithmeticException => println("除数不能为0")
    case e: Exception => println(e.getMessage)
  } finally {
    //释放资源， 一定能执行 : close file
  }

}
