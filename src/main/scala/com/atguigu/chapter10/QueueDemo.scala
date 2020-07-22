package com.atguigu.chapter10

object QueueDemo {
  def main(args: Array[String]): Unit = {

    import scala.collection.mutable

    val q1 = new mutable.Queue[Int]  //队列中存放Int
    println(q1)


    q1 += 20 //  默认加在队列的后面
    q1 += 21 //  默认加在队列的后面
    println(q1) //Queue(20,21)

    q1 ++= List(2,4,6) // Queue(20,21,2,4,6)
    println(q1)

    //q1 += List(1,2,3) //泛型为Any才ok Queue(20,21,2,4,6,List(1,2,3))
    //println(q1)

  }
}
