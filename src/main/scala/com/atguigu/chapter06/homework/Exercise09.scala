package com.atguigu.chapter06.homework

object Exercise09 {
  def main(args: Array[String]): Unit = {
    println(mi(2,1)) // 2.0
    println(mi(2,0)) // 1.0
    println(mi(2,-2)) // 0.5
    println(mii(2,-2)) // 0.5
  }

  def mii(i:Double,j:Int):Double = {
    if (j == 0)  1.0
    else if (j > 0) i*mii(i,j-1)
    else 1/mii(i,-j)
  }

  /*
  编写函数计算,其中n是整数，使用如下的递归定义://翻译工作
 = x*,如果n是正数的话
 = 1
 = 1/,如果n是负数的话
不得使用return语句
   */
  //难点，就是去确定函数的形式
  def mi(x: Double, n: Int): Double = {
    if (n == 0) 1.0
    else if (n > 0) x * mi(x, n - 1)
    else 1 / mi(x, -n)
  }
}
