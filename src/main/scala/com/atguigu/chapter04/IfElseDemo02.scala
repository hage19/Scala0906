package com.atguigu.chapter04

object IfElseDemo02 {
  def main(args: Array[String]): Unit = {

    //多分支，不管有多少个判断，只能有一个执行的入口
    val score = 75
    if (score > 80) {
      println("score>80")
    } else if (score > 70) {
      println("score>70")
    } else {
      println("xxx")

    }
  }
}
