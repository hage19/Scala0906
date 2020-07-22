package com.atguigu.chapter12

object ModeVar {
  def main(args: Array[String]): Unit = {
    val ch = 'V'

    //说明
    //1. 在scala中，可以将 match 当做有个表达式使用
    //2. 这个特性在后面的开发中，非常的有用!
    val res = ch match {
      case '+' => println("ok~")
      //说明
      //1 case mychar 叫模式的变量
      //2.mychar = ch
//      case _ => "ok~~"
      case mychar => println("ok~" + mychar) //ok
      case _ => "ok~~"

//      case _ => println ("ok~~")
    }

    println("res=" + res) // ()

  }
}
