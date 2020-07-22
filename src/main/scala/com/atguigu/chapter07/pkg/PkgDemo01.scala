package com.atguigu.chapter07.pkg

import scala._ // scala包的内容不需要引入就可以使用，但是子包的内容需要引入才能
import scala.io._ // _ 表示 *
import Predef._ // Predef包默认引入
object PkgDemo01 {
  def main(args: Array[String]): Unit = {
      val str = "abc"
      println(str.hashCode)
  }
}
