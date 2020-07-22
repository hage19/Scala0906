package com.atguigu.chapter12

object VarsMode {
  def main(args: Array[String]): Unit = {

    //    val num1 = 10
    //    val num2 = 30
    //    var name  = "jack"
    //Scala语法，是比较飘逸
    val (num1, num2, name, num3) = (10, 20, "jack", sum(10, 50))
    println("num1=" + num1)
    println("num2=" + num2)
    println("name=" + name)
    println("num3=" + num3)


  }

  def sum(n1:Int,n2:Int): Int = {
    n1 + n2
  }
}
