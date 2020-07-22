package com.atguigu.chapter07.myextends

object ScalaSuper {
  def main(args: Array[String]): Unit = {
    val emp = new Emp6("venessa", 18)
    emp.showInfo()
  }

}

//我希望大家写出这里的代码
//1 var name :String 在父类 Person6初始化
//2.var age: Int 在子类 Emp6 初始化

class Person6(pName:String) {
  var name :String = pName
  println("父类中初始化name")
  var age: Int = _
}

class Emp6(eName:String,eAge:Int) extends  Person6(eName) {


  this.age = eAge
  println("子类中初始化age")


  def showInfo(): Unit = {
    println("信息如下 " + this.name + " " + this.age)
  }
}
