package com.atguigu.chapter12

object PairMatchDemo {
  def main(args: Array[String]): Unit = {
    for (pair <- Array((0, 1), (1, 0), (1, 1),(1,0,2))) {
      val result = pair match { //
        case (0, _) => "0 ..." // 匹配 第一个值为 0, 第二个值任意的元组
        case (y, 0) => y //匹配 第一个值为 任意, 第二个值为0
        case (x, y) => println(x, y)
        case _ => "other" //.默认
      }
      println(result)
    }

  }
}
