package com.atguigu.chapter12.caseclass

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
      println("xxx")
  }
}

abstract class Amount
//说明
//1. 一个样例类，在底层会生成两个.class
//2 一个是  Dollar.class ,对应的是 非静态的内容，可以理解就是伴生类
//  ，会生成很多方法(copy,hashcode, toString...)
//3. 一个是 Dollar$.class , 对应是静态类型，可以理解成是伴生对象
//  , 会生成很多方法，比如(apply, unapply方法)
case class Dollar(value: Double) extends Amount {
  val name:String = "hell" //属性
  def cry(): Unit = { //方法
    println("ok")
  }
}
case class Currency(value: Double, unit: String) extends Amount
case object NoAmount extends Amount

