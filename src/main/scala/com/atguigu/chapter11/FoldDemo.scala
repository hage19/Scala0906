package com.atguigu.chapter11

object FoldDemo {
  def main(args: Array[String]): Unit = {
    // 折叠
    val list = List(1, 2, 3, 4)
    def minus( num1 : Int, num2 : Int ): Int = {//方法
        num1 - num2
    }
    //list.foldLeft(5)(minus)
    //1. 可以认为是 (5, 1, 2, 3, 4 ) 操作
    //2. ((((5-1)-2) – 3)  - 4) = -5
    println(list.foldLeft(5)(minus)) // 函数柯里化 -5
    //3.可以认为是 ( 1, 2, 3, 4 , 5) 操作
    //4. 1-(2-(3-(4-5))) = 3
    println(list.foldRight(5)(minus)) // 3


    //形式
    //方法和函数
    //方法转成函数
    //直接定义一个函数
    //可以给一个高阶函数，直接传到一个匿名函数
    //可以给一个高阶函数传递方法（方法->函数）



  }
}
