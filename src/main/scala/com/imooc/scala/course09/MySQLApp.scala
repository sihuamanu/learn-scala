package com.imooc.scala.course09

import java.sql.{Connection, DriverManager}


/**
  * Created by sihua.ancloudera.com on 2020/1/29.
  */
object MySQLApp {

  def main(args: Array[String]): Unit = {

    val url = "jdbc:mysql://10.65.5.212:3306/mysql"
    val username = "mysql"
    val password = "123456"

    var connection:Connection = null
    try{
      // make the connection
      classOf[com.mysql.jdbc.Driver]

      connection = DriverManager.getConnection(url, username, password)

      // create the statement and run the query
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("select host,user from user")
      while (resultSet.next()){

        val host = resultSet.getString("host")
        val user = resultSet.getString("user")

        println(s"$host, $user")
      }
    } catch {
      case e:Exception => e.printStackTrace()

    } finally {
      if(connection == null) {
        connection.close()
      }
    }

   }

}
