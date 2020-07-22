package com.atguigu.chapter10

object MultiplyArray {
  def main(args: Array[String]): Unit = {

    val array1 = Array.ofDim[Int](3, 4) //默认元素为0
    array1(1)(1) = 9 // 给第二个一维数组的第二个元素赋值

    for (item <- array1) { //item是 Array[Int]
      for (item2 <- item) { // 取出了各个元素
        print(item2 + "\t")
      }
      println()
    }


    println("========传统===========")
    for (i <- 0 until array1.length) {
      for (j <- 0 until array1(i).length) {
        printf("arr[%d][%d]=%d\t", i, j, array1(i)(j))
      }
      println()
    }

    val array02 = Array(Array(1, 2), Array("苹果", "香蕉", "葡萄"), Array(1.0))
    //使用for循环来玩
    for (item <- array02) {
      for (item2 <- item) {
        print(item2 + "\t")
      }
      println()
    }

  }
}
