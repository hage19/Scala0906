package com.atguigu.chapter10

import scala.collection.mutable.ArrayBuffer
object ArrayBufferDemo {

  def main(args: Array[String]): Unit = {

    val arr01 = ArrayBuffer[Any](3, 2, 5)

    println("arr01(1)=" + arr01(1))
    for (i <- arr01) {
      println(i)
    }
    println(arr01.length) // 3

    println("arr01.hash=" + arr01.hashCode())
    arr01.append(90.0,13) //(3,2,5,90.0,13)
    println("arr01.hash=" + arr01.hashCode())

    arr01(1) = 89 //修改 (3,89,5,90.0,13)
    println("--------------------------")
    for (i <- arr01) {
      println(i) //  (3,89,5,90.0,13)
    }

    //删除
    arr01.remove(0) //remove 表示删除第几个元素，从0开始编号
    println("--------------------------")
    for (i <- arr01) {
      println(i) //(89,5,90.0,13)
    }
    println("最新的长度=" + arr01.length) //4


  }
}
