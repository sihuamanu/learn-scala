package com.imooc.scala.course04

/**
  * trait和抽象类差不多用法
  */
object TraitApp {
  def main(args: Array[String]): Unit = {

  }
}

// 区别在于如果继承多个trait，则继承的第一个trait用extends，剩下的都用with
class Person789 extends Person123 with Person456 {
  override def health = ???

  override def speed = ???

  override  val name = "PK"

  override  val gender = "male"
}

trait Person123 {
  def health
  val name:String
}

trait Person456 {
  def speed
  val gender:String
}