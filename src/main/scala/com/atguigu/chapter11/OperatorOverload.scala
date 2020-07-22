package com.atguigu.chapter11

object OperatorOverload {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2
    val r2 = n1.+(n2) //看Int的源码即可说明t
    println("r1=" + r1 + " r2=" + r2)
    val dog = new Dog2
    dog.+(90) //中置操作符
    dog + 10
    println(dog.age) // 100

    dog - 8
    println(dog.age) //92

//    dog++
//    println(dog)
    //println(dog)
    //println("dog.age=" + dog.age) //93
    println(dog++)
    dog++()
    println(dog)
    !dog
    println(dog.age) //-92


    println("-------------------------")
    val oper = new Operate
    oper++() //查一下.
    println(oper++)
    println(oper.++)
    println(oper.n) // 11

  }
}

class Operate {
  var n = 10
  //定义函数/方法的时候，省略的()
  def ++() = {
    this.n += 1
  }
}


class Dog2 {
  var age = 0
  def +(n:Int): Unit = {
    this.age += n
  }

  def -(n:Int): Unit = {
    this.age -= n
  }

  //后置操作符[待会调一下]
  def ++(): Unit = {
    this.age += 1
  }

  //
  def unary_! = {
    this.age = -this.age
  }
}



