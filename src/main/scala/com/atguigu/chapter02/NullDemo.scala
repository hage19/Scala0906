package com.atguigu.chapter02

object NullDemo {
  def main(args: Array[String]): Unit = {
    /*
    Null类只有一个实例对象，null，类似于Java中的null引用。null可以赋值给任意引用类型(AnyRef)，但是不能赋值给值类型(AnyVal: 比如 Int, Float, Char, Boolean, Long, Double, Byte, Short)

     */
//    var c: Int = null // null 不能赋给AnyVal类型
//    var cat: Cat = null // null 可以赋给AnyRef
//
//    var b:Byte = 10
//
//    var c2:Char = 90
//   // var s:Short = b + c2
//   // var s2:Short = 1+1

    println(8.99.toInt)

  }
}

class Cat
