package com.atguigu.chapter09

object TestObject {
  implicit def f2(d:Double): Int = {
    d.toInt
  }

  implicit def f4(dog:Dog): Tiger = {
    new Tiger(dog.name)
  }
}
