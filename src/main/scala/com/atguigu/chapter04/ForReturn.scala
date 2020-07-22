package com.atguigu.chapter04

object ForReturn {
  def main(args: Array[String]): Unit = {

    val res = for(i <- 1 to 10) yield i * 2
    println("res=" + res)

    val res2 = for(i <- 1 to 10) yield f1(i)
    println("res2=" + res2)

    //修改成
    for{i <- 1 to 3
        j =  i * 2} {
      println(" i= " + i + " j= " + j)
    }

  }

  def f1(n:Int): Double = {
    math.sqrt(n.toDouble)
  }
}
