package com.atguigu.chapter07.myextends

object methodOverride {
  def main(args: Array[String]): Unit = {
    val emp = new Emp2
    emp.printName()
  }
}

class Person2 {
  var name : String = "tom"
  def printName()  = {
    println("Person printName() " + name)
  }
}

class Emp2 extends  Person2 {
  //在scala中，重写方法，需要使用override  显示声明
  override def printName(): Unit = {
    println("emp 的  printName")
    //子类去调用父类的方法，使用super
    super.printName()
  }
}
