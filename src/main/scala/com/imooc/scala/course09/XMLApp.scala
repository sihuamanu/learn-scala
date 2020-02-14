package com.imooc.scala.course09

import java.io.{FileInputStream, InputStreamReader}

import scala.xml.XML

/**
  * Created by sihua.ancloudera.com on 2020/1/29.
  */
object XMLApp {

  def main(args: Array[String]): Unit = {

    //loadXML()
    readXMLAttr()
  }

  def readXMLAttr(): Unit ={
    val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))
    //println(xml)
    val units = (xml \\ "units").map(x => (x.text)).foreach(println)
    //println(units)
    /*for (unit <- units){
      println(unit)
    }*/

    val unit_attrs = (xml \ "symbol").map(_ \ "@ticker")

    for (unit_attr <- unit_attrs){
      println(unit_attr)
    }
  }

  def loadXML(): Unit ={
    /*val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))

    println(xml)*/

    /*val xml = XML.load(new FileInputStream("/Users/sihua.ancloudera.com/Documents/Weekly-Work/kerberos-example/scala-train/src/main/resources/test.xml"))
    println(xml)*/

    /*val xml = XML.load(new InputStreamReader(
      new FileInputStream(
        "/Users/sihua.ancloudera.com/Documents/Weekly-Work/kerberos-example/scala-train/src/main/resources/test.xml")))
    println(xml)*/

  }

}
