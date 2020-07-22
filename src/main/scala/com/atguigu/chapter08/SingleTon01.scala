package com.atguigu.chapter08

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single


object TestSingleTon extends App {
  val singleTon = SingleTon.getInstance
  val singleTon2 = SingleTon.getInstance
  println(singleTon2 == singleTon) // true
}

//将SingleTon的构造方法私有化
class SingleTon private() {}

//懒汉式...
object SingleTon {
  private var s: SingleTon = null

  def getInstance = {
    if (s == null) {
      s = new SingleTon
    }
    s
  }
}

class Single private() {}

object Single{
  private var s:Single = new Single
  def getSingle():Single = {
    return s
  }
}