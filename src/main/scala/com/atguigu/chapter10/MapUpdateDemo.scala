package com.atguigu.chapter10

import scala.collection.mutable

object MapUpdateDemo {
  def main(args: Array[String]): Unit = {

    val map4 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    //map4("A~") = 20 //修改和增加,和二为一


    //增加, 因为map是可变，因此是无序的.
    map4 += ("D" -> 100)
    map4 += ("E" -> 200)

    println(map4)
    //增多个元素
    map4 += ("F" -> 100, "Y" -> 300 )
    //使用元组的方式添加
    map4 += (("U" , 400), ("P", 500))
    //在添加时，如果该key已经存在，等价于修改
    map4 += (("U" , 401))

    //添加后，将这个结果返回给新的map
    val map5 = map4 + ("E"->1, "F"->3)

    println(map4)


    //删除
    map4 -= ("A")
    map4 -= ("A", "B") //如果key不存在，也不报错
    map4.remove("Y")

    println("map4=" + map4)


    //遍历
    val map1 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    for ((k, v) <- map1) println(k + " is mapped to " + v)
    for (v <- map1.keys) println(v)
    for (v <- map1.values) println(v) //
    for(v <- map1) println(v + " key=" + v._1 + " value=" + v._2) // v 对应的就是一对 k-v (即二元组)


  }
}
