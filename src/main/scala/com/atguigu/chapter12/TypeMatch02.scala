package com.atguigu.chapter12

object TypeMatch02 {
  def main(args: Array[String]): Unit = {

    val obj =
      if(1>0) 10
    val result = obj match {
      case a : Int => a
      case b : Map[String, Int] => "Map集合" //这里会报错
      case _ => "啥也不是"
    }
    println(result)

  }
}
