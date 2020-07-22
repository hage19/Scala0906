package com.atguigu.chapter09

import com.atguigu.chapter09.TestObject._

object ImplicitChance {


  def main(args: Array[String]): Unit = {

    f1(10)
    f1(11.1)  //

    //创建狗
    val dog = new Dog("小花狗")
    f3(dog) //
  }

  def f1(n1:Int): Unit = {
    n1 * 2
    println(n1)
  }

  def f3(tiger:Tiger): Unit = {
    println(tiger.name) //
  }
}

class Dog (var name:String)
class Tiger(var name:String)


