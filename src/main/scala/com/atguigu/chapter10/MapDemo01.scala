package com.atguigu.chapter10

import scala.collection.mutable

object MapDemo01 {
  def main(args: Array[String]): Unit = {

    //创建不可变Map
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println("map1=" + map1)
//    map1("Alice")=11
    println(map1)

    //创建可变Map
    val map2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    println("map2=" + map2)

    //方式3-创建空的映射

    val map3 = new scala.collection.mutable.HashMap[String, Int]
    println(map3) // Map()

    //创建方式4- 直接使用对偶元组

    val map4 = mutable.Map(("Alice" , 10), ("Bob" , 20), ("Kotlin" , 30))
    println("map4=" + map4)



    //方式1-使用map(key)
    //说明
    //1. 如果key存在，则返回对应值
    //2. 如果key不存在，则抛出异常
    val value1 = map4("Alice")
    println(value1) //10

    //方式2-使用contains方法检查是否存在key

    if(map4.contains("Bob~")) {
      println(map4("Bob"))
    } else {
      println("没有对应key")
    }


    //方式3-使用map.get(key).get取值
    var map5 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    println(map5.get("A")) //Some(1)
    //这里提示大家如果map5.get("A") 返回的 None， 你再去get就会抛出异常
    println(map5.get("A").get) //得到Some在取出 1


    //方式4-使用map.getOrElse()取值
    val map6 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    println(map6.getOrElse("A","默认"))// getOrElse底层就是加入 if(map.continas(xx)) {} else{}


  }
}
