package com.atguigu.chapter17.covariantandotherDemo

object covariantAndOtherDemo {
  def main(args: Array[String]): Unit = {
    val t: Temp[Sub] = new Temp[Super]("hello world1")
  }
}

//Temp[A] 不变
//Temp[+A] 协变，基本含义是指 Super 是 Sub的父类那么 Temp[Super] 就是Temp[Sub]父类
//Temp[-A] 逆变，基本含义是指 Super 是 Sub的父类那么 Temp[Super] 就是Temp[Sub]子类
class Temp[-A](title: String) { //Temp3[+A] //Temp[-A]
  override def toString: String = {
    title
  }
}

//支持协变
class Super //父类

class Sub extends Super //Sub 是Super子类

