package com.atguigu.chapter04

import util.control.Breaks._
object BreakDemo {
  def main(args: Array[String]): Unit = {

    var n = 10
    //先看效果，再做解释
    /*
    def breakable(op: => Unit) {
    try {
      op
    } catch {
      case ex: BreakControl =>
        if (ex ne breakException) throw ex
    }
  }
   1.  breakable 是一个高阶函数
   2. 可以接受 op: () => Unit  , op 表示一个函数, 该函数没有输入值，没有返回值
   3. 可以直接将一段代码传入给 breakable , 这种现象叫控制抽象
   4. 在breakable 函数中，他catch异常，因此我们的break() 就不会异常中断
     */
    breakable {
      while (n <= 20) {
        println("n=" + n)
        n += 1
        //当 n == 18 时，就break
        if (n == 18) {
          //def break(): Nothing = { throw breakException }
          break() //Nothing
        }

      }
    }

    printf("go on")
  }
}
