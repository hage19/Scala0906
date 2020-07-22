package com.atguigu.chapter05

object LazyDemo {
  def main(args: Array[String]): Unit = {
    //普通的方法

    lazy val res = myMax(1, 2)
    println("-----------------")
    println("res=" + res)


  }

  def myMax(n1:Int,n2:Int): Int = {
    println("myMax被调用")
    //计算量很大方法

    f1(n1)

    n1 max n2
  }

  def f1(n1:Int): Int = {
    println("f1被调用")
    n1 * 3
  }
}
