package com.atguigu.chapter04

object ImportVar {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 3; j = 4 - i) { //引入变量
      print(j + " ") // 3 2 1
    }

    //上面的代码可以等价
    println("------------------------")
    for (i <- 1 to 3) {
      val j = 4 - i
      println("j=" + j)
    }

  }
}
