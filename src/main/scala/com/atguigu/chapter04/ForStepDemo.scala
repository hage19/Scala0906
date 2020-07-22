package com.atguigu.chapter04

object ForStepDemo {
  def main(args: Array[String]): Unit = {

    //需求说有个结合  1 to 10
    //输出的步长 3  1 4 7 10

    //1. 方式1 使用scala 提供的 Range
    // 说明 Range 底层使用是 until
    val start = 1
    val end = 11  //
    val step = 3
    println("使用Range控制步长")
    for (i <- Range(start,end,step)) {
      println("i=" + i)
    }

    //2. 方式2： 灵活的使用 守卫实现步长控制
    println("--守卫实现步长控制---")
    for (i <- start until end if i % step == 1) {
      println("i=" + i)

    }
  }
}
