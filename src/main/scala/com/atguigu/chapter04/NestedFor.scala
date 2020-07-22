package com.atguigu.chapter04

object NestedFor {
  def main(args: Array[String]): Unit = {

    for(i <- 1 to 3; j <- 1 to 3) {
      // 1 1
      // 1 2
      // 1 3
      // 2..
      // 3..
      println(" i =" + i + " j = " + j)

    }


    //上面代码等价
    println("-----------------------")
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println(" i =" + i + " j = " + j)
      }

    }

  }
}
