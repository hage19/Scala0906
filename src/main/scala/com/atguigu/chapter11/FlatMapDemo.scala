package com.atguigu.chapter11

object FlatMapDemo {
  def main(args: Array[String]): Unit = {

    val names = List("Alice", "Bob", "Nick")
    def upper( s : String ) : String = {
      s. toUpperCase
    }

    val names2 = names.flatMap(upper)
    println("names2=" + names2)
  }
}
