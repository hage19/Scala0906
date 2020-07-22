package com.atguigu.chapter11

object StreamDemo {
  def main(args: Array[String]): Unit = {
    def numsForm(n: BigInt) : Stream[BigInt] = n #:: numsForm(n + 1)
    val stream1 = numsForm(4)
//    val stream1 = numsForm(1)
    println(stream1) // (1, ?)
    //取出第一个元素
    println("head=" + stream1.head) // 1
    println(stream1.tail.tail) // (2, ?)
    println(stream1.tail) // (2, ?)
    println(stream1) // (1, 2, 3, ?)


    println(numsForm(5))
    println(numsForm(5).map(multi))
  }
  def multi(x:BigInt):BigInt = {
    x*x
  }
}
