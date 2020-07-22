package com.atguigu.chapter10

object TupleDemo {
  def main(args: Array[String]): Unit = {
    val t1 = (1, 2, 3, "hello", "jack",(1,3,9))
    //t1 => Tuple5

    println(t1)

    //访问Tuple的元素的方式有两种
    //1. 方式1 t1_顺序号 , 顺序号是从1开始编号

    println(t1._4) // "hello"

    //2. 方式2 productElement(索引号) 访问元组的第一个元素，从0开始
    println(t1.productElement(3))

    //遍历元组
    for (item<- t1.productIterator) {
      println("item=" + item)
    }
  }
}


