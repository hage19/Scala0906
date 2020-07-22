package com.atguigu.chapter13

object HigherOrderFunction {
  def main(args: Array[String]): Unit = {

    def minusxy(x: Int) = {
      (y: Int) => x - y // 匿名函数
      //第二种写法
//      def f1(y: Int) = {
//        x - y
//      }
//      f1 _
    }

    //说明
    //1.  minusxy是一个高阶函数，返回了一个匿名函数
    //2. 返回的匿名函数是 (y: Int) => x – y ， 这个返回的函数使用到x
    //3. minusxy(3)(5) 看出两部操作 (1) 先返回一个函数 (y: Int) => 3 – y (2)
    //  然后执行该返回的匿名函数 3-5 = -2

    val res = minusxy(3)(4) // 函数柯里化形式
    println("res=" + res)

  }
}
