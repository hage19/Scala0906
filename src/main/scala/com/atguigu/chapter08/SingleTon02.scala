package com.atguigu.chapter08

object TestSingleTon02 extends App {
  val singleTon = SingleTon02.getInstance
  val singleTon2 = SingleTon02.getInstance
  println(singleTon.hashCode() + " ~ " + singleTon2.hashCode()) //一样
  println(singleTon == singleTon2) // true
}

//将SingleTon的构造方法私有化
class SingleTon02 private() {
  println("~~~")
}

object SingleTon02 {
  private val s: SingleTon02 = new SingleTon02 //放在内存
  def getInstance = { //当需要使用时，直接返回
    s
  }
}

