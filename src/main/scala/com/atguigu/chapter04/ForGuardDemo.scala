package com.atguigu.chapter04

object ForGuardDemo {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 3 if i != 2) {
      println("i=" + i)
    }

    println("---------------------")
    val list = List(1,2,3,4,5)
    for (i <- list if i != 3) {
      println("i=" + i)
    }
  }
}
