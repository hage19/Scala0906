package com.atguigu.chapter09

object ImplicitVal {
  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jack" //隐式值
    def hello(implicit name: String): Unit = { // hello$1
      println(name + " hello")

      def hello(): Unit = { //   hello$2
        println("aaa")
      }
    }
    //就近原则
    hello // ? 输出? hello$1(str1) =>  jack hello
  }

  def hello(): Unit = { //函数名 hello
    println("bb")
  }
}

