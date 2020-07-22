package com.atguigu.chapter03

object IfElseDemo {
  def main(args: Array[String]): Unit = {

    val n1 = 9
    val n2 = 81
    //val res = (n1 > n2) ? n1 :n2 不支持三目运算
    val res = if (n1 > n2) n1 else n2
    println("res=" + res)
  }
}
