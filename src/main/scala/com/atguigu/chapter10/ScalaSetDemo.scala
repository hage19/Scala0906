package com.atguigu.chapter10

import scala.collection.mutable


object ScalaSetDemo {
  def main(args: Array[String]): Unit = {

    val set01 = Set(1,2,4,"abc")
    println(set01) //不可变的Set仍然有序



    val set02 = mutable.Set(1,2,4,"abc")
    set02.add("atguigu")
    set02.add(10.5)
    set02.add("abc") //如果添加时，有重复的数据，也不会报错
    println(set02)

    //删除
    set02 -= (1 ,2) //一次性删除多个元素
    set02.remove("atguigu")
    println("set02=" + set02)

    


    val set03 = mutable.Set(1,2,4,19, -1, 56, 7)
    println(set03 max )
    println(set03.max)

    println(set03 min)
    println(set03.min)

  }
}
