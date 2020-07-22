package com.atguigu.chapter09

object ImplicitRichClass {
  def main(args: Array[String]): Unit = {

    //使用隐式转换丰富类的功能
    implicit def addDelete(mySqL:MySQL): DB = {
      //将 返回一个DB的实例
      new DB
    }

    //创建Mysql对象
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete() //底层 => addDelete$1(mySQL).delete()
    mySQL.cry() // 底层 => addDelete$1(mySQL).cry()
   }
}




class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }

  def cry(): Unit = {
    println("DB cry...")
  }
}

