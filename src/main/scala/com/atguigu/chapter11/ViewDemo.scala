package com.atguigu.chapter11

object ViewDemo {
  def main(args: Array[String]): Unit = {

    //请找到1-100 中，数字倒序排列 和它本身相同的所有数。(1 2, 11, 22, 33 ...)

    def eq(i: Int): Boolean = {
      i.toString.equals(i.toString.reverse)
    }
    //说明: 没有使用view
    val viewSquares1 = (1 to 100)
      .filter(eq) //过滤
    println(viewSquares1)
    println("------")
    //使用view就可以懒加载,而且不缓冲数据
    val viewSquares2 = (1 to 100)
       .view
      .filter(eq) //过滤
    println(viewSquares2)
    println("------")

    for (item<-viewSquares2) {
      println("item=" + item)
    }

  }
}
