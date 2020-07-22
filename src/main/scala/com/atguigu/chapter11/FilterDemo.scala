package com.atguigu.chapter11

object FilterDemo {
  def main(args: Array[String]): Unit = {

    val names = List("Alice", "Bob", "Nick")
    def startA(s:String): Boolean = { //方法
      s.startsWith("A")
    }

    val names2 = names.filter(startA)
    println("names2=" + names2)

    //小练习
    val nums = List(1,2,3,4,5,6) //请使用filter机制，返回偶数
    def f1(n:Int): Boolean = {
      println("被调用了~~")
      if (n % 2 == 0) true else false

    }

    println(nums.filter(f1)) //

  }

}
