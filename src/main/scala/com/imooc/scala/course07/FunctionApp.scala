package com.imooc.scala.course07

/**
  * 匿名函数： 函数是可以命名的，也可以不命名
  *
  * （参数名：参数类型。。。） => 函数体
  */
object FunctionApp extends App {


  /*def sayHello(name:String): Unit ={
    println("Hi: " + name)
  }

  sayHello("PK")*/


  //将原来接受两个参数的一个函数，转换成接收2个
  /*def sum(a:Int, b:Int) = a + b
  println(sum(2, 3))

  def sum2(a:Int)(b:Int) = a + b
  println(sum2(2)(3))*/

  val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  /*
    l.map((x: Int) => x + 1)
    l.map((x) => x + 1)
    l.map(x => x + 1)*/
  l.map(_ + 1).foreach(println)

  l.map(_ * 2).filter(_ > 8).foreach(println)

  // 1+2 3+3 6+4 10+5 15+6 21+7 28+8 36+9 45
  l.reduce(_ + _)
  l.reduceLeft(_ - _)
  l.reduceRight(_ - _)

  val f = List(List(1, 2), List(3, 4), List(5, 6))

  println(f.flatten)

  val txt = scala.io.Source.fromFile("/Users/sihua.ancloudera.com/app/hello.txt").mkString

  println(txt)

  val txts = List(txt)

  txts.flatMap(_.split(",")).map((_,1)) //
  .foreach(println)


}
