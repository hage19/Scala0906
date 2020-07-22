package com.atguigu.chapter14

object RecursiveApp01 {
  def main(args: Array[String]): Unit = {
    // 求出 List的最大值
    def max(xs: List[Int]): Int = {
      if (xs.isEmpty) //为空，返回异常
        throw new java.util.NoSuchElementException
      if (xs.size == 1) // 为1 ，返回这个值
        xs.head //
      //如果xs.head > max(xs.tail) 就返回头，否则递归找
      else if (xs.head > max(xs.tail)) xs.head else max(xs.tail)
    }

    val list = List(1, 2, 3, 5, -1)
    println(max(list)) // 5
  }
}
