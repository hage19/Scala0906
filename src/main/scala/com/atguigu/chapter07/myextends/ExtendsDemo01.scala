package com.atguigu.chapter07.myextends

object ExtendsDemo01 {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.study()
  }
}

class Person {
  var name = "jack"  // private name => public name() public name_$eq
  var age = 10

  def showInfo(): String = {
    s"信息如下 name=${this.name} age = ${this.age}"
  }
}

class Student extends  Person {
  def study(): Unit = {
    //this.name()  this.age()
    println(this.name + " "+ this.age + " 努力学习中...")
  }
}
