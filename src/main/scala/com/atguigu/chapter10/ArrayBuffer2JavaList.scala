package com.atguigu.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {

    // Scala集合和Java集合互相转换
    val arr = ArrayBuffer("1", "2", "3")
    //引入了bufferAsJavaList 隐式函数
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr) //为什么可以这样使用?//ProcessBuilder
    val arrList = javaArr.command() // arrList 就是 java.util.List
    println(arrList) //输出 [1, 2, 3]

    //java的List 转成 scala的 Buffer
    import scala.collection.JavaConversions.asScalaBuffer
    /*
    implicit def asScalaBuffer[A](l : java.util.List[A]) : scala.collection.mutable.Buffer[A]
     */

    val scalaArr: mutable.Buffer[String] = arrList //

  }
}
