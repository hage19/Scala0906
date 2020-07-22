package com.atguigu.chapter17.generic

object GenericDemo01 {
  def main(args: Array[String]): Unit = {
    val intMessage = new IntMessage(11)
    val strMessage = new StrMessage("hello")
    println(intMessage.get) // 11
    println(strMessage.get) // hello
  }
}

//抽象类,指定泛型

abstract class Message[T](s: T) {
  def get: T = s
}

//可以构建Int类型的Message,String类型的Message.
class IntMessage[Int](mes:Int) extends Message(mes)
class StrMessage[String](mes:String) extends Message(mes)


