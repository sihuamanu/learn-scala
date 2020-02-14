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
  val reduce = l.reduce(_ + _)

  // 1-2 -1-3 -4-4 -8-5 -13-6 -19-7 -26-8 -34-9 -43
  // reduceLeft _ - _ 就是用左边的 _ 作用 - 到 右边的 _
  val reduceLeft = l.reduceLeft(_ - _)

  // 2-1 3-1 4-2 5-2 6-3 7-3 8-4 9-4 5
  // reduceRight _ - _ 就是用右边的 _ 作用 - 到 左边的 _
  val reduceRight = l.reduceRight(_ - _)

  println("reduce" + reduce)
  println("reduceLeft" + reduceLeft)
  println("reduceRight" + reduceRight)

  val f = List(List(1, 2), List(3, 4), List(5, 6))

  println(f.flatten)

  val txt = scala.io.Source.fromFile("/Users/sihua.ancloudera.com/app/hello.txt").mkString

  println(txt)

  val txts = List(txt)

  txts.flatMap(_.split(",")).map((_,1)) //
  .foreach(println)


}
