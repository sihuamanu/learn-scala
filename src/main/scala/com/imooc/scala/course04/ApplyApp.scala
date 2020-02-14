package com.imooc.scala.course04


object ApplyApp {
  def main(args: Array[String]): Unit = {
/*
    for(i <- 1 to 10) {
      ApplyTest.incr
    }

    println(ApplyTest.count) // 10, 说明object本身就是一个单例对象*/

    val b = ApplyTest() // ==> object.apply

    val c = new ApplyTest()
    println(c)
    c()

    // 类名() ==> object.apply
    // 对象() ==> class.apply
  }

}


// 伴生类和伴生对象

//如果有一个class，还有一个与class同名的object， 那么class是object的伴生类，object是class的伴生对象
class ApplyTest{
  def apply() = {
    println("class ApplyTest apply...")

  }

}

object ApplyTest {

  println("object ApplyTest enter...")

  var count = 0

  def incr = {
    count = count + 1
  }
  //最佳实践： 在Object的apply方法中去new class
  def apply(): ApplyTest = {
    println("object ApplyTest apply...")

    //在object中的apply中new class
    new ApplyTest
  }

  println("object ApplyTest leave...")


}