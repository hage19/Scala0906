package com.atguigu.chapter10

import scala.collection.mutable

object QueueDemo02 {
  def main(args: Array[String]): Unit = {

    val q1 = new mutable.Queue[Int]//
    q1 += 12
    q1 += 34
    q1 ++= List(2,9) //q1(12,34,2,9)
    val res = q1.dequeue() // 从队列的头部，取出一个元素,队列本身会变化
    println("res=" + res) // 12
    println(q1) //q1(34,2,9)

    //入队列,将数据加入队列尾部
    q1.enqueue(20,60) //q1(34,2,9,20,60)
    println(q1)


    //tail不会对队列有影响
    println(q1.tail) // q1(2,9,20,60)
    println(q1.tail.tail) // q1(9,20,60)

    println("q1:=" + q1) //q1(34,2,9,20,60)
  }
}
