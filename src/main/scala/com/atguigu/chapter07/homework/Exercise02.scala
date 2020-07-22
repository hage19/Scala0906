package com.atguigu.chapter07.homework

import scala.beans.BeanProperty

object Exercise02 {
  def main(args: Array[String]): Unit = {
    println("yy..")
  }
}

class Student { //看一下 Studet.class 后底层生成了哪些方法
  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}
