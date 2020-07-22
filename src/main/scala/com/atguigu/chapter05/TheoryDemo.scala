package com.atguigu.chapter05

object TheoryDemo {
  def main(args: Array[String]): Unit = {
    val n1 = 10
    val n2 = 30
    val res = sum(n1, n2)
    println("res=" + res) // 40
  }

  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

}
