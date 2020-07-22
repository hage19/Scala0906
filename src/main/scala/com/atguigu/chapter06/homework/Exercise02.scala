package com.atguigu.chapter06.homework

object Exercise02 {
  def main(args: Array[String]): Unit = {


    // 代码块是可以当做一个表达式来使用的
    // 一个空的代码块返回的结果是 ()
    var res = {}
    //在scala中，可以通过 isInstanceof来判断类型
    println(res.isInstanceOf[Unit] + " " + res) //
  }
}
