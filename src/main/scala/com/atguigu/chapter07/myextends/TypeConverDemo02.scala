package com.atguigu.chapter07.myextends

object TypeConverDemo02 {
  def main(args: Array[String]): Unit = {
    val person = new Person5
    val emp = new Emp
    val worker = new Worker5

    test(person)
    test(emp)
    test(worker)
  }

  def test(p:Person5): Unit = {
    //根据p的真实类型，调用对应方法
    if (p.isInstanceOf[Emp]) {
      p.asInstanceOf[Emp].sayOk()
    } else if (p.isInstanceOf[Worker5]) {
      p.asInstanceOf[Worker5].sayHi()
    } else if (p.isInstanceOf[Person5]) {
      p.printName()
    } else {
      println("类型不匹配")
    }
  }
}

class Person5 {
  var name = "kristina"
  def printName(): Unit = {
    println(name + " 你好!")
  }
}

class Emp extends  Person5 {
  def sayOk(): Unit = {
    println(this.name + " say ok")
  }
}

class Worker5 extends  Person5 {
  def sayHi(): Unit = {
    println(this.name + " say hi")
  }
}
