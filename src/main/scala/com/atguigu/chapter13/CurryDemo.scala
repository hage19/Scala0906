package com.atguigu.chapter13

object CurryDemo {
  def main(args: Array[String]): Unit = {
    //方式2：使用稍微高级的用法(隐式类)：形式为 str.方法()
    //我们认为比较字符串是否相等是两件事，先转成小写[函数]， 再比较是否相等[函数]
    //任务1.比较两个字符串是否相等
    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)
    }

    //隐式类
    implicit class TestEq(s: String) {
      //第一个参数是str, 第二参数是一个匿名函数
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        //完成任务1 转成小写 , 比较是否相等的任务，就交给  f
        f(s.toLowerCase, ss.toLowerCase)
      }
    }

    //创建两个字符串
    val str1 = "hello"
    val str2 = "HELLO"
    //传递的写法
    println(str1.checkEq(str2)(eq)) //隐式转换

    //简化的写法
    println(str1.checkEq(str2)(_.equals(_))) // true
  }
}
