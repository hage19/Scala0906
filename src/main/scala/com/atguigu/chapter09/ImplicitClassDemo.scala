package com.atguigu.chapter09

object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {

    implicit class DB1(val m: MySQL1) { //DB1隐式类 => 类$DB1
      def addSuffix(): String = { //方法
        m + " scala"
      }
    }
    //直接使用，转换工作交给编译器

    val mySQL1 = new MySQL1
    println(mySQL1)
    mySQL1.sayOk()
    //说明
    //1. //底层  DB1$1(mysql1).addSuffix()
    //2. DB1$1(mysql1) 才是一个隐式类[ImplicitClassDemo$DB1$2]的实例
    //3. 隐式类名称 ImplicitClassDemo$DB1$2
    val res = mySQL1.addSuffix() //
    println("res=" + res)

  }
}

class MySQL1 {
  def sayOk(): Unit = {
    println("sayOk")
  }


}



