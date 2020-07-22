package com.atguigu.chapter07.homework

object Exercise04 {
  def main(args: Array[String]): Unit = {
    import java.util.{HashMap => JavaHashMap} //重命名
    //mutable是可变
    import collection.mutable.{HashMap => ScalaHashMap, _}//重命名

    val javaMap = new JavaHashMap[Int, String] //[Int,String]泛型
    javaMap.put(1, "One"); //加入了四对 key-val
    javaMap.put(2, "Two");
    javaMap.put(3, "Three");
    javaMap.put(4, "Four");
    val scalaMap = new ScalaHashMap[Int, String] //创建scala的map


    //说明
    //1. javaMap.keySet() 将javaMap的所有key取出(集合)并转成数组
    //2. key.asInstanceOf[Int] ： 表将 javaMap的key转成 Int
    //3. javaMap.get(key) : 表示通过key获取到 value
    //4. (key.asInstanceOf[Int] -> javaMap.get(key)) :表示一对 key-value
    //5. scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key)) 将 (key.asInstanceOf[Int] -> javaMap.get(key)) 添加到  scalaMap
    for (key <- javaMap.keySet().toArray) {

      scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key))
    }

    println("scalamap=" + scalaMap)
  }
}


object Test {
  def main(args: Array[String]): Unit = {
    println("hello, world!")
  }
}

object Test2 extends App{ // main方法
  println("hello, scala!")
}
