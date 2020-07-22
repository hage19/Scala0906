package com.atguigu.chapter11

object ReduceLeftDemo {
  def main(args: Array[String]): Unit = {

    val list = List(1, 20, 30, 4, 5) //集合
    def sum(n1: Int, n2: Int): Int = { //方法=》接收两个参数
      n1 + n2
    }
    //说明 list.reduceLeft(sum)
    //1. reduceLeft向左化简
    //2. sum 是函数， 是二元函数
    //3. 化简的流程 , 从左开始，取两个值，然后将计算的结果 作为第一个参数，再次传入sum
    ///  直到包所有的元素遍历完毕
    //4. (((1 + 20) + 30) + 4) + 5 => 60
    val res = list.reduceLeft(sum)
    println("res=" + res) //60


  }
}
