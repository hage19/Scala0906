package com.atguigu.chapter04

object ForExercise04 {
  def main(args: Array[String]): Unit = {
    //完成下面的表达式输出
    // 0 + 6 = 6
    // .......
    //思路
    //1. 定义一个变量 max = 6
    //2. 使用一个for循环即可
    val max = 10
    for (i <- 0 to max) {
      printf("%d + %d = %d \n", i, (max - i), max)
    }
  }
}
