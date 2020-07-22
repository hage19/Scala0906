package com.atguigu.chapter05

object RecursiveDemo02 {
  def main(args: Array[String]): Unit = {
    /*
    请使用递归的方式，求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的斐波那契数是多少？
    思路
    1. n == 1 或者 n == 2 , 结果就是1
    2. 当n > 2 时，其实值 (n-1) + (n-2)
    3. 翻译代码
     */
    println(fbn(7))

    //已知 f(1)=3; f(n) = 2*f(n-1)+1; 

    println(f(10))

  }

  //已知 f(1)=3; f(n) = 2*f(n-1)+1; 
  //上面这种题特别简单，直接翻译

  def f(n:Int): Int = {
    if (n==1) 3
    else 2 * f(n-1) + 1
  }

  def fbn(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fbn(n - 1) + fbn(n - 2)
    }
  }
}
