package com.atguigu.chapter05

object MonkeyPeach {
  def main(args: Array[String]): Unit = {
    println("day1=" + peach(1))
  }
  /*
  题3：猴子吃桃子问题有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第十天时，想再吃时（还没吃），发现只有1个桃子了。问题：最初共多少个桃子？(5min) // 1534

  思路 =>规律
  1. 第10天 day10    1
  2. 第9天  (day10 + 1) * 2   = (1 + 1) * 2 = 4
  3. 待8天  (day9 + 1) * 2 = ( 4 + 1) * 2 = 10
  ....

   */

  def peach(day:Int): Int = {

    if (day == 10) {
      return 1 //递归返回
    } else {
      return  (peach(day+1) + 1) * 2
    }
  }
}
