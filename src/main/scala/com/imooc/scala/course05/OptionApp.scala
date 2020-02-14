package com.imooc.scala.course05

/**
  * Created by sihua.ancloudera.com on 2020/1/28.
  */


/**
  * case object None extends Option[Nothing] {
  *   def isEmpty = true
  *   def get = throw new NoSuchElementException("None.get")
  * }
  *
  * final case class Some[+A](x: A) extends Option[A] {
  *   def isEmpty = false
  *   def get = x
  * }
  *
  */
object OptionApp extends App{

  val m = Map(1 -> 2)

  println(m.getOrElse(2, "None"))

}


