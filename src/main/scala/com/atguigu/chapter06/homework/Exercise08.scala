package com.atguigu.chapter06.homework

object Exercise08 {
  def main(args: Array[String]): Unit = {
    println(product("Hello"))
  }

  //把7练习中的函数改成递归函数, 使用递归方式求出字符串的累计的乘积
  def product(str:String): Long = {
    if (str.length == 1)  str(0).toLong
    else str(0).toLong * product(str.drop(1))
  }
}
