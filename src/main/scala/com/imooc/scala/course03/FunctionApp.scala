package com.imooc.scala.course03

/**
  * Created by sihua.ancloudera.com on 2020/1/28.
  */
object FunctionApp {
  def main(args: Array[String]): Unit = {

    /*println(add(2, 3))

    println(three())

    println(three)  //没有入参的函数，调用时括号可以省略

    sayHello()
    sayHello

    sayName()
    sayName("rouze")

    println(speed(100, 10))

    println(speed(time = 10, distance = 100)) //命名参数，在传参的时候指定参数的名字，可以不按照参数定义时的顺序

    println(sum(1, 2, 3))

    1 to 10
    1.to(10)*/

    //Range(1,10,2)

    /*for (i <- 1 to 10 if i % 2 == 0){
      println(i)
    }*/

    /*for (i <- 1 until 10){
      println(i)
    }*/

    val courses = Array("Hadoop", "Spark SQL", "Spark Streaming", "Storm", "Scala")

    /*for (course <- courses) {
      println(course)
    }*/

    courses.foreach(course => println(course))

    var (num, sum) = (100, 0)

    while (num > 0){  //出口
      sum = sum + num
      num = num - 1 //步长
    }
    println(sum)
  }

  def add(x:Int, y:Int): Int = {
    x + y

  }

  def three() = 1 + 2

  def sayHello(): Unit ={
    println("Say Hello...")

  }

  def sayName(name:String = "PK"): Unit ={
    println(name)
  }

  def speed(distance:Float, time:Float): Float = {
    distance/time

  }

  def sum(numbers: Int*) = {  //可变参数， 参数的个数可以变化的

    var result = 0
    for (number <- numbers){
      result += number
    }

    result

  }


}
