package com.atguigu.chapter17.generic

object GenericDemo03 {
  def main(args: Array[String]): Unit = {

    println(getMidEle[Int](List(1,2,3)))
    println(getMidEle[String](List("A","B","C","D")))

  }

  /*
定义一个函数，可以获取各种类型的 List 的中间index的值
使用泛型完成

 */
  //说明
  //1. 在方法后可以使用泛型 A 就是泛型
  //2. 泛型可以直接放在形参内部
  def getMidEle[A](l: List[A])={
    l(l.length/2)
  }

}

