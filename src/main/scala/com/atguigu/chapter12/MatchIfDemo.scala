package com.atguigu.chapter12

object MatchIfDemo {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明1 case _ if 的 _ 不是表示默认匹配，而是忽略
        // 也可以做范围的匹配.
        case _ if ch.toString.equals("3") => digit = 3
        // case _ 表示 默认匹配
        case _ => sign = 2
      }
      //推断一下
      // + 1 0
      // - -1 0
      // 3 0 3
      // ! 2 0
      println(ch + " " + sign + " " + digit)
    }

  }
}
