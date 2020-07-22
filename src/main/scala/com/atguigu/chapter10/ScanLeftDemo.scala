package com.atguigu.chapter10

object ScanLeftDemo {
  def main(args: Array[String]): Unit = {

    def minus( num1 : Int, num2 : Int ) : Int = {
      num1 - num2
    }
    // 5 (1,2,3,4,5) (5, 4, 2,  -1, -5, -10 )
    val i8 = (1 to 5).scanLeft(5)(minus)

    println(i8)

  }
}
