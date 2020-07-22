package com.atguigu.chapter07

object ScalaPkg {
  def main(args: Array[String]): Unit = {

    val cat1 = new com.atguigu.chapter07.xm200.Cat
    val cat2 = new com.atguigu.chapter07.xq.Cat

    println("cat1=" + cat1)
    println("cat2=" + cat2)
    var res = 1L

    "Hello".foreach((c:Char) => {
      res *= c.toLong
      //Unit
    })



    println("res=" + res)

    f2((n:Int) => {
      println(n)
      //n
      1
    }, 10)
  }




  def f2(f:(Int) => Int, n:Int) = {
    f(n)
  }

  def f1(): Unit = {

    //return "xxx"
    //10
  }
}

abstract class Animal2 {
  var name: String //
  var age: Int //
  var color: String = "black"

  def cry()
}