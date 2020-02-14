package com.imooc.scala.course09

import scala.io.Source

/**
  * Created by sihua.ancloudera.com on 2020/1/29.
  */
object FileApp {

  def main(args: Array[String]): Unit = {

    val file = Source.fromFile("/Users/sihua.ancloudera.com/app/hello.txt")(scala.io.Codec.UTF8)

    def readLine(): Unit ={
      for(line <- file.getLines()){
        println(line)
      }
    }

    //readLine()

    def readChar(): Unit ={
      for(ele <- file){
        println(ele)
      }
    }

    //readChar()

    def  readNet(): Unit ={
      val file = Source.fromURL("http://www.baidu.com")

      for(line <- file.getLines()){
        println(line)
      }
    }

    readNet()

  }

}
