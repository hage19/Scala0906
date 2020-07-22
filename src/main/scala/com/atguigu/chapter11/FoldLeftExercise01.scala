package com.atguigu.chapter11

import scala.collection.mutable.ArrayBuffer

object FoldLeftExercise01 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    //方法, 接收两个参数 ， ArrayBuffer, Char
    def putArry( arr : ArrayBuffer[Char], c : Char ): ArrayBuffer[Char] = {
      arr.append(c)
      arr
    }

    //使用
    //1. 创建一个ArrayBuffer ab
    //2. 调用foldLeft,将ab做到第一个元素进行左折叠
    val ab = ArrayBuffer[Char]()
    sentence.foldLeft(ab)(putArry) //就是一个左折叠的案例
    println("ab=" + ab)
  }
}
