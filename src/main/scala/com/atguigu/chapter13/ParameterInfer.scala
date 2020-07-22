package com.atguigu.chapter13

object ParameterInfer {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, -2)
    println(list.map((x: Int) => x + 1)) //结果 List(2,3,4,5)

    //简化1次
    println(list.map((x) => x + 1))
    //简化2次, 因为只有一个参数，()可以去掉
    println(list.map(x => x + 1))
    //简化3次，因为x 在=> 出现一次，因此使用 _ 替代
    println(list.map(_ + 1))

    //看一段代码
    println(list.reduceLeft(_ + _)) //结果是 10

    //看它的原型
    println(list.reduceLeft(_ + _)) // 10

    //求出 List的最小数
    println(list.reduceLeft((x,y) => {
      if (x > y) y else x
    }))
    //古老写法
    //list.reduceLeft(sum)

  }

  def sum(x:Int,y:Int): Int = {
    x + y
  }
}
