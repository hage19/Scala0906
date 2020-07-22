package com.atguigu.chapter14

object RecursiveFbnDemo {
  def main(args: Array[String]): Unit = {

    var count = 0
    //递归  10
    def fbn(n: Long): Long = {
      count += 1
      if (n == 1 || n == 2) {
        1
      } else {
        //重复计算, 没有使用尾递归..(所谓尾递归，就是解决普通的递归调用栈过多，容易溢出问题)
        //，而且普通递归，不能及时的释放栈, 尾递归可以将返回结果，作为参数传入，可以利用编译器的特性，及时的是否栈
        //会重复计算，增长的次数指数级
        fbn(n - 1) + fbn(n - 2)
      }
    }

    println(fbn(50))
    println("调用了count=" + count)

  }


}
