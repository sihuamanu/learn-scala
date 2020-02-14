package com.imooc.scala.course08

import java.io.File

import ImplicitAspect._


object ImplicitApp extends App{

  //定义隐式转换函数
  //implicit def man2superman(man: Man):Superman = new Superman(man.name)
  val man = new Man("PK")
  man.fly()


  //implicit def file2RichFile(file: File): RichFile = new RichFile(file)
  /*val file = new File("hello.txt")

  val txt = file.read()

  println(txt)*/

  def testParam(implicit name:String): Unit ={
    println(name + "~~~~~~~")
  }

  //testParam("zhangsan")
  //implicit val name = "implicit_name"
  //testParam
  //testParam("PK")

  //implicit val s1 = "s1"
  //implicit val s2 = "s2"
  //testParam


}


class Man(val name:String) {
  def eat(): Unit ={
    println(s"man[ $name ] eat .....")
  }
}


class Superman(val name:String){
  def fly(): Unit ={
    println(s"superman[ $name ] fly .....")
  }
}


class RichFile(val file:File) {
  def read() = {
    scala.io.Source.fromFile(file.getPath).mkString
  }



}
