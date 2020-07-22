package com.atguigu.chapter02

object VarDemo05 {
  def main(args: Array[String]): Unit = {

    var num1 = 2.7 //8.1/3
    println("num1=" + num1)
    var num2 = 2.7
    println(num1==num2) //true? false?

    //建议：如果对精度要求高，使用double
    //如果不知道精度要求，使用double
    //明确知道运行结果的精度不高，使用float
    var num3 = 2.2345678912f
    var num4 = 2.2345678912
    println("num3=" + num3) // float
    println("num4=" + num4) // double
  }
}
