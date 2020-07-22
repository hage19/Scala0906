package com.atguigu.chapter11

object MapExercise01 {
  def main(args: Array[String]): Unit = {

    val names = List("Alice", "Bob", "Nick")
    def upper(s:String): String = {
      println("被调用~~~")
      s.toUpperCase
    }
    val f2 = upper _
    val utils = new Utils
    val f1 = utils.upper _
    val names2 = names.map(f2)
    println(names2)
    println("--")
    val names3 = names.map(upper)
    println("names=" + names3) //得到大写的字符串

  }
}

class Utils(){
  def upper(s:String): String = {
    println("被调用--~~~")
    s.toUpperCase
  }
}