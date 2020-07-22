package com.atguigu.chapter14

import java.text.SimpleDateFormat
import java.util.Date

object RecursiveDemo02 {
  def main(args: Array[String]): Unit = {
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("执行前=" + date) //输出时间

    //递归，测试
    var num = BigInt(1)
    var sum = BigInt(0)
    var res = mx(num,sum)


    println("res=" + res)
    //结束时间
    val now2: Date = new Date()

    val date2 = dateFormat.format(now2)
    println("执行后=" + date2) //输出时间
  }

  // 递归的方式来解决
  // 递归效率本身没有太大问题，问题我们使用不要让递归进行重复计算
  def mx(num:BigInt,sum:BigInt):BigInt = {
    //尾递归, 能够将结果作为参数传入到递归函数
    if(num <= 99999999l) return mx(num+1,sum + num)
    else return sum
  }

}
