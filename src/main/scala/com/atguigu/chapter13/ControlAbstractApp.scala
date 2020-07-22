package com.atguigu.chapter13

object ControlAbstractApp {
  def main(args: Array[String]): Unit = {

    //先写一段代码
    var n = 10
    while (n > 0) { //while循环, 可以通过控制抽象 实现
      n -= 1
      println("n=" + n)
    }


    var n2 = 10
    mywhile(n2 > 0) { //函数编程的特点..
      n2 -= 1
      println("n2=" + n2)
    }

  }

  //我们自己通过控制抽象，写出自己的mywhile
  def mywhile(condition: => Boolean)(block: => Unit): Unit = {
    //类似while循环，递归
    if (condition) {
      block
      mywhile(condition)(block)
    }

  }

}
