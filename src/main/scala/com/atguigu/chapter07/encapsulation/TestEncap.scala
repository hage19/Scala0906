package com.atguigu.chapter07.encapsulation

object TestEncap {
  def main(args: Array[String]): Unit = {
    val person = new Person("jack")
    person.setAge(199)
    val res = person.getAge("123456")
    if (res.isInstanceOf[Exception]) {
      println(res.asInstanceOf[Exception].getMessage)
    }else {
      println(s"查看结果是 ${person.name} age = ${person.getAge("123456")}")
    }
  }
}


/*
那么在Scala中如何实现这种类似的控制呢?
请大家看一个小程序(TestEncap.scala),不能随便查看人的年龄,工资等隐私，并对输入的年龄进行合理的验证[要求1-120之间，否则给一个默认年龄18]。

 */

class Person(pName: String) {
  var name = pName
  private var age = 0
  private var sal = 0.0
  private val pwd = "123456"

  def setAge(age: Int): Unit = {
    if (age <= 0 || age > 120) {
      println("age 范围不对")
      return
    }
    this.age = age
  }

  def getAge(pwd: String): Any = {
    //加入条件
    if (!pwd.equals(this.pwd)) {
      return new Exception("你无权查看..")
    }
    return this.age
  }

}
