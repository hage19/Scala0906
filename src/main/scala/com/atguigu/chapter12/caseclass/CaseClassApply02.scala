package com.atguigu.chapter12.caseclass

object CaseClassApply02 {
  def main(args: Array[String]): Unit = {

    val amt = Currency(29.95, "RMB") //对象
    val amt1 = amt.copy() //  默认拷贝，会使用到 amt本身的属性值
    val amt2 = amt.copy(value = 888.8, unit = "美元")
    val amt3 = amt.copy(unit = "英镑")
    println(amt1) // amt1.toString
    println(amt2) //
    println(amt3)


  }
}
