package com.atguigu.chapter04

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    //输出10句 "hello,尚硅谷!"

    for (i <- 1 to 10) {
      println("hello,尚硅谷!" + i)
    }

    //for的<- 后可以直接是集合，类似java for循环增强
    val arr = Array("苹果", "葡萄", "榴莲")
    for (item <- arr) {
      println("item=" + item)
    }

    //使用until的方式输出10句 "hello,尚硅谷!"

    val start = 1
    val end = 11
    println("--------------------------------")
    for (i <- start until end) { // end没有被输出
      println("你好，尚硅谷" + i)
    }
  }
}
