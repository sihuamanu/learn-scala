package com.imooc.scala.course08

import java.io.File

/**
  * Created by sihua.ancloudera.com on 2020/1/29.
  */
object ImplicitAspect {


  implicit def man2superman(man: Man): Superman = new Superman(man.name)

  implicit def file2RichFile(file: File): RichFile = new RichFile(file)

}
