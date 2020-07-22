package com.atguigu.chapter09

object ImplicitValue {
  def main(args: Array[String]): Unit = {
    //str1就是一个隐式值
    implicit val str1: String = "jack"
    implicit val str2: Int = 10

    hello // jack hello => 底层是hello(str1)
  }

  //name就是隐式参数
  def hello(implicit name: String="java", age:Int= 1 ): Unit = {
    println(name + " hello"+age)
  }
  def hello(): Unit ={
    println("====")
  }

//  def hello(name: String="java",age:Int=10): Unit = {
//    println(name + age + " hello")
//  }
}




