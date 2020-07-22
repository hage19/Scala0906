package com.atguigu.chapter04

object IfElseDetail {
  def main(args: Array[String]): Unit = {

    //说明
    //1. if else 可以直接作为表达式返回值
    //2. 返回的结果是什么类型，取决于具体逻辑
    val res = if (5 < 3) {
      //println("hello")
      "hello"
    } else {
      "尚硅谷"
    }

    println("res=" + res) // res = ()
  }
}
