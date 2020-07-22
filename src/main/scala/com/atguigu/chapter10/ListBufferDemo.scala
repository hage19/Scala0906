package com.atguigu.chapter10

import scala.collection.mutable.ListBuffer

object ListBufferDemo {
  def main(args: Array[String]): Unit = {

    val lst0 = ListBuffer[Int](1, 2, 3) //创建

    println("lst0(2)=" + lst0(2)) //3
    for (item <- lst0) {
      println("item=" + item)
    }

    val lst1 = new ListBuffer[Int]
    lst1 += 4 //添加 lst1 (4)
    lst1.append(5) // lst1(4,5)

    lst0 ++= lst1 //追加集合的元素  lst0(1,2,3,4,5)
    val lst2 = lst0 ++ lst1 //lst2(1,2,3,4,5, 4,5)
    val lst3 = lst0 :+ 5 //lst3(1,2,3,4,5,5)

    println("lst0=" + lst0)
    println("lst2=" + lst2)
    println("lst3=" + lst3)

    println("=====删除=======")
    println("lst1=" + lst1) //lst1(4,5)
    lst1.remove(1) //lst(4)
    for (item <- lst1) {
      println("item=" + item) //4
    }//加入代码说明

  }
}
