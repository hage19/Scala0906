package com.atguigu.chapter05



object Exercise {
  def main(args: Array[String]): Unit = {
    //编写一个函数/方法,从终端输入一个整数(1—9),打印出对应的乘法表:【
    print99(9)

    //函数
    val myPrint = (n:Int) => {
      //使用嵌套循环
      for (i <- 1 to n) {
        for (j <- 1 to i) {
          printf("%d * %d = %d\t", j , i , j * i)
        }
        println()
      }
    }
    println("----------------------")
    myPrint(9)

    val myPrint2 = print99 _
    println("----------------------")
    myPrint2(9)
  }

  def print99(n:Int): Unit = {
    //使用嵌套循环
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        printf("%d * %d = %d\t", j , i , j * i)
      }
      println()
    }
  }
}
