package com.atguigu.chapter06.homework

object Exercise04 {
  def main(args: Array[String]): Unit = {
    //countdown(10)
    countDown2(10)
  }
  //编写一个过程countdown(n:Int)，打印从n到0的数字
  def countdown(n:Int): Unit = {
    for (i<- 0 to n reverse) {
      println(i)
    }
  }

  //第二种方式, 使用到 高阶函数[后面详解,这里先介绍一下，打点基础]
  def countDown2(n: Int): Unit = {
    //第二种方法
    //(0 to n).reverse.foreach(println)

    //说明
    //1. foreach是一个函数，是一个高阶函数
    //2. foreach可以接受一个 (Int) => Unit 函数
    //3. myPrint(_) 是表示，foreach 会去遍历 res0 = Range(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    //   每一个元素， 然后传递给 myPrint(_), 一共会传递 11次
    //4. 在scala规定，如果介绍的只有一个参数，类型可以确定，则可以省略（_）
    val res0 = (0 to n).reverse
    val res1 = res0.foreach(println)
    println("res1=" + res1)

    //一步到位
    //(0 to n).reverse.foreach(println)

  }

  def myPrint(n:Int): Unit = {
    println(n)
  }
}
