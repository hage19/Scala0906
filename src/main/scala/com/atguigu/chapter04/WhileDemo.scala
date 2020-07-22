package com.atguigu.chapter04

object WhileDemo {
  def main(args: Array[String]): Unit = {
    //输出10句"你好,尚硅谷"
    var n = 0
    while (n < 10) {
      println("你好,尚硅谷" + n)
      n += 1
    }
  }
}
