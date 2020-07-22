package com.atguigu.chapter10

object OperatorOverload {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    println(cat.age)
    cat += 9 //对年龄 +=
    cat.+=(10) //
    println(cat.age) // 29
  }
}

class Cat {
  var age = 10
  def +=(n:Int): Unit = {
    this.age += n
  }
//  def ++=(cats:Array[Cat]): Unit = {
//
//  }
}



