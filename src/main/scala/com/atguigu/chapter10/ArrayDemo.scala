package com.atguigu.chapter10

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val arr01 = new Array[Int](4)
    println(arr01.length) // 长度 4

    println("arr01(0)=" + arr01(0)) // 默认0
    for (i <- arr01) { //遍历
      println(i)
    }
    println("--------------------")
    arr01(3) = 10 //第四个元素为 10
    for (i <- arr01) {
      println(i)
    }

    //定义array的第二种方式
    println("***********************")
    var arr02 = Array(1, 3, 90) //apply

    for (i <- arr02) { // 长度为3
      println(i)
    }


  }


}

