package com.atguigu.chapter09

object ImplicitDemo01 {



  def main(args: Array[String]): Unit = {

    //写一个隐式函数
    implicit def f1(d:Double): Int = {
      d.toInt
    }

    implicit def f2(l:Long): Int = {
      l.toInt
    }

    //在一个环境（作用域），在隐式转换时，只能有一个隐式函数被匹配
//    implicit def f3(d:Double): Int = {
//      d.toInt
//    }

    //说明
    //1. 如果以后看到 ____ 则表示使用到了隐式转换
    //2. 转换的本质是编译器在生成.class文件时，就帮助转换
    val num : Int = 3.5// 底层 3.5 => f1$1(3.5)
    val num2:Int = 4.6//

    val num3:Int = 1L //  底层 f2$2(1L)
    println(num + " " + num2 + " " + num3)

  }

}


