package com.atguigu.chapter07.myextends



object Extends02 {
  def main(args: Array[String]): Unit = {
    val sub = new Sub()
    println("---------------")
    sub.sayOk()
  }
} //自己Lamp

class Base { //基类
  var n1: Int = 1
  protected var n2: Int = 2 // public public
  private var n3: Int = 3 //private private

  //默认public
  def test100(): Unit = {
    println("base 100")
  }

  //protected
  protected def test200(): Unit = {
    println("base 200")
  }
  //private
  private def test300(): Unit = {
    println("base 300")
  }
}


//Sub 继承了  Base
class Sub extends Base {
  def sayOk(): Unit = {
    this.n1 = 20  // this.n1()
    this.n2 = 40 // this.n2()
    println("范围" + this.n1 + this.n2)

    this.test100()
    this.test200()

  }
}
