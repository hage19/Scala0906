package com.atguigu.chapter06.homework

object Exercise06 {
  def main(args: Array[String]): Unit = {
    /*
    同样是解决前一个练习的问题，请用StringOps的foreach方式解决
   */
    val str = "Hello"
    var res = 1L  //定义了变量 Long
    def f1(c:Char): Unit = {
      res *= c.toLong
    }
    //方式1：传统的方式
    str.foreach(f1)

    println("res=" + res) //9415087488

    //方式2：直接传入一个匿名函数给foreach
    var res2 = 1L
    str.foreach((c:Char) => {
      res2 *= c.toLong
    })
    println("res2=" + res2)

    //方式3：可以对第二种方式进行简化
    var res3 = 1L
    str.foreach(res3 *= _.toLong)
    //统计 一篇文章各个单词出现次数，并排序
    println("res3=" + res3)
  }

}
