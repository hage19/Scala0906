package com.atguigu.chapter02

object TypeDemo01 {
  def main(args: Array[String]): Unit = {

    var res = say()//因为say() 是Unit : res = ()
    println("res=" + res)

  }
  def say(): Unit = {
    println("kkkk")
  }
}
