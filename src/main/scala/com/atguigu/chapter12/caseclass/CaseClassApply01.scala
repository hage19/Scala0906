package com.atguigu.chapter12.caseclass

object CaseClassApply01 {
  def main(args: Array[String]): Unit = {

    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      //模式匹配
      val result = amt match {
        //说明
        //1. 这里使用到对象提取,   Dollar(1000.0) 的 1000.0 给  v
        case Dollar(v) => "$" + v
        //说明
        //2. 进行对象提取操作
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ": " + result)
    }

  }
}
