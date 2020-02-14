package com.imooc.scala.course06

import scala.util.Random

/**
  * Created by sihua.ancloudera.com on 2020/1/29.
  */
object MatchApp extends App{

  /*val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")

  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉泽明步")
    case "YuiHatano" => println("波多野结衣")
    case _ => println("不晓得")
  }*/

 /* def judgeGrade(grade:String): Unit ={
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so")
      case _ => println("You need to work harder")
    }
  }

  judgeGrade("A")
  judgeGrade("B")
  judgeGrade("C")
  judgeGrade("D")*/

  /*def judgeGrade(name:String, grade:String): Unit ={
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so")
      case _ if(name=="lisi") => println(name + "You need to work harder")
      case _ => println("You need to work harder")
    }
  }
  judgeGrade("zhangsan", "D")
  judgeGrade("lisi", "D")*/


  /*def greeting(array: Array[String]): Unit ={
    array match {
      case Array("zhangsan") => println("Hi: zhangsan")
      case Array(x, y) => println("Hi " + x + ", " + y)
      case Array("zhangsan", _*) => println("Hi: zhangsan and other friends")
      case _ => println("Hi everybody")
     }
  }

  greeting(Array("zhangsan"))
  greeting(Array("lisi", "wangwu"))
  greeting(Array("zhangsan", "lisi", "wangwu"))
  greeting(Array("lisi", "zhangsan", "wangwu"))*/


  /*def greeting(list: List[String]): Unit ={
    list match {
      case "zhangsan":: Nil => println("Hi : Zhangsan")
      case x::y::Nil => println("Hi " + x +", " + y)
      case "zhangsan"::tail => println("Hi Zhangsan and other friends")
      case _ => println("Hi Everybody")
    }

  }

  greeting(List("zhangsan"))
  greeting(List("zhangsan", "lisi"))
  greeting(List("zhangsan", "lisi", "wangwu"))
  greeting(List("lisi", "zhangsan", "lisi", "wangwu"))*/

  /*def matchType(obj:Any): Unit ={
    obj match {
      case x:Int => println("Int")
      case s:String => println("String")
      case m:Map[_,_] => m.foreach(println)
      case _ => println("other type")
    }
  }

  matchType(1)
  matchType("1")
  matchType(1f)
  matchType(Map("name" -> "PK"))*/

  /*def caseclassMatch(person: Person): Unit ={
    person match {
      case CTO(name,floor) => println("CTO name is " + name + " floor is " + floor)
      case Employee(name,floor) => println("Employee name is " + name + " floor is " + floor)
      case Other(name) => println("Other")
    }
  }

  class Person
  case class CTO(name:String, floor:String) extends Person
  case class Employee(name:String, floor:String) extends Person
  case class Other(name:String) extends Person

  caseclassMatch(CTO("zhangsan", "22"))
  caseclassMatch(Employee("lisi", "2"))
  caseclassMatch(Other("Others"))*/


  val grades = Map("PK" -> "A", "zhangsan" -> "C")

  def getGrade(name:String): Unit ={

    val grade = grades.get(name)

    grade match {
      case Some(grade) => println(name + ": your grade is : " + grade)
      case None => println("Sorry")
    }
  }

  getGrade("zhangsan")
  getGrade("PK")
  getGrade("lisi")
}
