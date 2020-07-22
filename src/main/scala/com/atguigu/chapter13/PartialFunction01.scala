package com.atguigu.chapter13

object PartialFunction01 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, "abc")

    //使用传统的方式map, 结果和我们希望的不一样
    val res = list.map(f1) // List(2,3,4,5,())
    println("res=" + res)

    //使用filer + map
    val res2 = list.filter(filter1).map(addOne) // List(1,2,3,4) // List[Any]
    println("res2=" + res2) // res2 = List(2,3,4,5)

  }

  def filter1(v:Any): Boolean = {
    if (v.isInstanceOf[Int]) true else false
  }

  def addOne(v:Any): Int = {
    //v 就是 Int
    v.asInstanceOf[Int] + 1
  }


  def f1(n:Any): Any = {
    if (n.isInstanceOf[Int]) {
      n.asInstanceOf[Int] + 1
    }
  }
}
