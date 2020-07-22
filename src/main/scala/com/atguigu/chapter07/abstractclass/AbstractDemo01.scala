package com.atguigu.chapter07.abstractclass

object AbstractDemo01 {
  def main(args: Array[String]): Unit = {
    println("xxx")
  }
}

//抽象类
//1. 抽象类中可以有普通的属性
//2. 抽象类中可以有抽象的属性
//3. 抽象类中可以有抽象的方法，并且不能使用abstract修饰
//4. 抽象类中可以有普通的方法(即实现的方法)
abstract class Animal {
  var name: String // 抽象属性
  var age: Int //  抽象属性
  var color: String = "black" //普通属性
  def cry() //抽象方法

  def sayHi(): Unit = {
    println("sayHi")
  }
}

//如果一个类继承了抽象类，
// 则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声明为abstract类
class Tiger extends Animal{
  override var name: String = _
  override var age: Int = _

  override def cry(): Unit = {

  }
}

abstract class Mouse extends Animal


abstract class CC{
  //抽象方法和抽象属性不能使用private、final 来修饰，因为这些关键字都是和重写/实现相违背的
  //private var name : String

  def sum(n1:Int,n2:Int) : Int

}
