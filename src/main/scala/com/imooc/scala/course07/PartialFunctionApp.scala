package com.imooc.scala.course07

import scala.util.Random

/**
  * 偏函数： 被包在花括号内没有match的一组case语句
  */
object PartialFunctionApp extends App {

  val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")

  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉泽明步")
    case "YuiHatano" => println("波多野结衣")
    case _ => println("不晓得")
  }


  def sayChinese:PartialFunction[String,String] = {
    case "Akiho Yoshizawa" => "吉泽明步"
    case "YuiHatano" => "波多野结衣"
    case _ => "不晓得"
  }

  println(sayChinese("YuiHatano"))


}
