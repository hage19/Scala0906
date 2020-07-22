package com.atguigu.chapter12

object TypeMatch {
  def main(args: Array[String]): Unit = {

    // 类型匹配, obj 可能有如下的类型
    val a = 1
    val obj = if(a == 1) 1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)
    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")
    else if(a == 6) Array(1, 2, 3)
    else if(a == 7) Array("aa", 1)
    else if(a == 8) Array("aa")

    //判断
    val result = obj match {
      //case _ 出现如下情况(忽略匹配的变量值)，则表示隐藏变量名，即不使用,
      // 而不是表示默认匹配
      //case _  => Int.MaxValue //默认匹配
      case _ : BigInt => Int.MaxValue //看这里!

      case a : Int => a //流程是，先把 a = obj, 在判断类型
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组" //String[]
      case e : Array[Int] => "对象是一个数字数组" //int[]
      case f : BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
    println(result)

  }
}
