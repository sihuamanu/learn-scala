package com.imooc.scala.course04


object ConstructorApp {
  def main(args: Array[String]): Unit = {

    val person = new Person("zhangsan", 30)
    println(person.name + " : " + person.age + " : " + person.school)

    val person2 = new Person("PK", 18, "M")
    println(person2.name + " : " + person2.age + " : " + person2.school + " ： " + person2.gender)

    val student = new Student("PK", 18, "Math")

    println(student.name + " : " + student.major + " : " + student.school)

    println(student)
    println(student.getClass())
  }


}


class Person(val name:String, val age:Int){ //跟在类名后面小括号里的，就是叫做主构造器
  println("Person Constructor enter ....")

  val school = "ustc"
  var gender: String = _

  //附属构造器
  def this(name:String, age:Int, gender: String){
    this(name,age) // 附属构造器的第一行代码必须调用主构造器或者其他附属构造器
    this.gender = gender

  }

  println("Person Constructor leave ....")

}

class Student(name:String, age:Int, var major:String) extends Person(name, age){

  println("Person Constructor enter son class....")

  override val school = "peking"

  override def toString: String = "Person: override def toString"



  println("Person Constructor leave son class....")

}