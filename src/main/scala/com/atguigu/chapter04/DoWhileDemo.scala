package com.atguigu.chapter04

object DoWhileDemo {
  def main(args: Array[String]): Unit = {
    //10 "hello,尚硅谷"
    var n = 0
    do {
      println("hello,尚硅谷" + n)
      n += 1
    }while(n < 10)
  }
}
