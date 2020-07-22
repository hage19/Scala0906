package com.atguigu.chapter11

object ParallerDemo {
  def main(args: Array[String]): Unit = {
//    //串行执行
//    (1 to 50).foreach(println)
//    println()
//    //并行执行
    (1 to 50).par.foreach(println)


    val result1 = (0 to 100).map{case _ => Thread.currentThread.getName}.distinct
    val result2 = (0 to 100).par.map{case _ => Thread.currentThread.getName}.distinct
    println(result1)
    println(result2)


  }
}
