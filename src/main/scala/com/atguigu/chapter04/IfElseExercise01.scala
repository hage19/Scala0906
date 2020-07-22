package com.atguigu.chapter04

import scala.io.StdIn

object IfElseExercise01 {
  def main(args: Array[String]): Unit = {
    //判断输入的年份是否是闰年，闰年的条件是符合下面二者之一：(1)年份能被4整除，但不能被100整除；(2)能被400整除

    val year = StdIn.readInt()
    if ((year % 4 == 0 && year % 100 != 0) || year% 400 == 0 ) {
      println(year + " 是闰年")
    } else {
      println(year + " 不是闰年")
    }
  }
}
