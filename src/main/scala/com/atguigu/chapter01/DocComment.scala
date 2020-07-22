package com.atguigu.chapter01

object DocComment {
  def main(args: Array[String]): Unit = {

    println("ok")
  }

  //写一个方法
  /**
    * @deprecated 快过期了
    * @param n1 n1 表示一个输入值
    * @param n2 n2 表示一个输入值
    * @return n1 + n2 和
    * @example 2 + 3 = 5
    */
  def sum(n1: Int, n2: Int): Int = {
    //在scala中，如果没有return ，则以最后一句话的结果为返回值
    n1 + n2
  }
}
