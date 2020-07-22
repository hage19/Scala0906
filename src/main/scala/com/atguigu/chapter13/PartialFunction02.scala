package com.atguigu.chapter13

object PartialFunction02 {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,"Hello")
    val res1 = list.map(addOne2)
    println("res1=" + res1) // List(2,3,4,5,()) // List[Any]

  }

  //这里如果使用简单的模式匹配，也不ok!

  def addOne2( i : Any ): Any = {
    i match {
      case x:Int => x + 1
      case _ =>
    }
  }

  //希望有一个机制, 对集合进行 filter + map的操作。 ==> 偏函数


}
