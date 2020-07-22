package com.atguigu.chapter10

object ScalaListDemo {
  def main(args: Array[String]): Unit = {

    //在package object scala
    // val List = scala.collection.immutable.List
   // val Nil = scala.collection.immutable.Nil
    val list01 = List(1, 2, 3) // apply方法，List 是Object
    println(list01) // List(1,2,3)
    val list02 = Nil  // List()
    println(list02)

  //给List追加元素
    var list1 = List(1, 2, 3, "abc")
    val list2 = list1 :+ 4
    println("list1=" + list1) //?  List(1,2,3,"abc")
    println("list2=" + list2) //? List(1,2,3,"abc", 4


    var list3 = List(1, 2, 3, "abc")
    val list4 = 4 +: list3
    println("list3="+ list3) //l List(1,2,3,"abc")
    println("list4=" + list4) //新的列表结果是? List(4, 1,2,3,"abc")



    //给List追加集合

    val list5 = List(1, 2, 3, "abc")
    //执行的过程
    //1. 执行时，从右向左
    //2. List(4,5,6,List(1, 2, 3, "abc"))
    val list6 = 4 :: 5 :: 6 :: list1 :: Nil

    println("list6=" + list6)



    //下面等价 4 :: 5 :: 6 :: list1
    //1.执行过程, 从右向左
    //2. List(4,5,6, 1, 2, 3, "abc")
    val list7 = 4 :: 5 :: 6 :: list1 ::: Nil
    println("list7=" + list7)

  }
}
