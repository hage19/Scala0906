package com.atguigu.chapter08.mytrait

object SelfTypeDemo {
  def main(args: Array[String]): Unit = {
    println("hello~~")
  }
}

//Logger 就具体self -type
trait Logger2 {
  //自身类型的体现
  this: Exception =>
  def log(): Unit ={
    // 既然我就是Exception, 那么就可以调用其中的方法
    println(getMessage)
  }
}



//class Console extends Logger2 //错误，因为Console不是 Logger 的自身类型约束 Exception

class Console extends Exception with Logger2 // 正确，因为Console是Exception的子类

