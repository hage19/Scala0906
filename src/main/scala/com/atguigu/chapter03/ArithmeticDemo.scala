package com.atguigu.chapter03

object ArithmeticDemo {
  def main(args: Array[String]): Unit = {

    var r3 : Double = 10.0 / 3   // 3.333333
    println("r3=" + r3 )
    //如果我们希望将返回的Double,保留到小数点2
    r3 = r3.formatted("%.2f").toDouble
    println("r3=" + r3) // 3.33

  }
}
