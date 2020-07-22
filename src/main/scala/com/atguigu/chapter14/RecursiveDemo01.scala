package com.atguigu.chapter14

import java.text.SimpleDateFormat
import java.util.Date

object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = dateFormat.format(now)
    println("执行前=" + date) //输出时间
    var res = BigInt(0)
    var num = BigInt(1)
    var maxVal = BigInt(99999999l) //BigInt(99999999l)[测试效率大数]
    while (num <= maxVal) { //普通方法
      res += num
      num += 1
    }
    println("res=" + res)
    //结束时间
    val now2: Date = new Date()

    val date2 = dateFormat.format(now2)
    println("执行后=" + date2) //输出时间


  }
}
