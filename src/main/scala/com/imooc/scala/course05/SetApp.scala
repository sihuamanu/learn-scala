package com.imooc.scala.course05

/**
  * Created by sihua.ancloudera.com on 2020/1/28.
  */
object SetApp extends App{

  val s1 = Set(1,2,3,4)

  /*for(ele <- s1){
    println(ele)
  }*/
  println(s1)

  val s2 = scala.collection.mutable.Set[Int]()

  s2 += 1

  println(s2)

}
