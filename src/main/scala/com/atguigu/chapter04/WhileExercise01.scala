package com.atguigu.chapter04

object WhileExercise01 {
  def main(args: Array[String]): Unit = {
    //打印1—100之间所有能被3整除的数
    var i = 1
    val max = 100
    while (i <= max) {
      if (i % 3 == 0) {
        printf("i=%d\n" , i)
      }
      i += 1
    }
  }
}
