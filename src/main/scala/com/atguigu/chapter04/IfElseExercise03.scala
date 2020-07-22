package com.atguigu.chapter04

import scala.io.StdIn

object IfElseExercise03 {
  def main(args: Array[String]): Unit = {
    /*
    求ax2+bx+c=0方程的根。a,b,c分别为的变量，如果：b2-4ac>0，则有两个解；
b2-4ac=0，则有一个解；b2-4ac<0，则无解，结果保留小数点两位. [a=3 b=100 c=6]
提示1：x1=(-b+sqrt(b2-4ac))/2a
               X2=(-b-sqrt(b2-4ac))/2a
    //思路
    1. 定义三个变量 a,b,c
    2. 因为有三个情况，因此使用多分支
    3. 因为 b^2-4ac 使用5次，因此我们可以使用一个变量m 保存值
    //代码实现
     */

    println("输入a")
    val a = StdIn.readDouble()
    println("输入b")
    val b = StdIn.readDouble()
    println("输入c")
    val c = StdIn.readDouble()
    val m = b * b - 4 * a * c

    if (m > 0) {
      val x1 = (-b + math.sqrt(m)) / (2 * a)
      val x2 = (-b - math.sqrt(m)) / (2 * a)
      printf("x1=%.2f x2=%.2f\n", x1, x2)
    } else if (m == 0) {
      val x1 = (-b + math.sqrt(m)) / (2 * a)
      printf("x1=%.2f\n", x1)
    } else {
      println("无解...")
    }

  }
}
