package com.atguigu.chapter08.mytrait

object TraitPropertiesDemo {
  def main(args: Array[String]): Unit = {
    //  MySQL6 mySQL = new MySQL6() { private String opertype;}
    val mySQL = new MySQL6 with DB6
    println(mySQL.opertype)
  }
}

trait Operate6 {
  var opertype : String
  def insert()
}

trait DB6 extends  Operate6 {
  var opertype : String = "insert"
  def insert(): Unit = {
  }
}
class MySQL6 {}

