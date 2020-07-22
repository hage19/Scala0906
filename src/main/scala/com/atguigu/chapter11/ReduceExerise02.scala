package com.atguigu.chapter11

object ReduceExerise02 {
  def main(args: Array[String]): Unit = {
    //使用化简的方法求出 List(3,4,2,7,5) 最小的值
    val list = List(3,4,2,7,5)
    println(list.reduceLeft(myMin)) //2
    println(list.reduceRight(myMin)) //2
  }

  def myMin(n1: Int, n2: Int): Int = {
    //if (n1 > n2) n2 else n1
    n1 max n2
  }
}
