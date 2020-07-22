package com.atguigu.chapter11

object ZipDemo {
  def main(args: Array[String]): Unit = {
    // 拉链
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    val list3 = list1.zip(list2) // ((1,4),(2,5),(3,6))
    println("list3=" + list3)

    val arr1 = Array("北京", "天津", "深圳")
    val arr2 = Array("首都", "天津卫", "小村子")

    println(arr1.zip(arr2).mkString(" "))

    val arr3 = arr1.zip(arr2)
    for (item <- arr3) {
      println(item._1 + " 也叫 " + item._2)
    }

  }
}
