package com.atguigu.chapter13

object PartialFunction03 {
  def main(args: Array[String]): Unit = {
    //使用偏函数解决前面的问题，【代码演示+说明】
    val list = List(1,2,3,4,"Hello",1.2, 89.1, 1l)

    //创建偏函数=> 函数
    //1. 偏函数是通过  PartialFunction (trait)创建
    //2. [Any,Int] Any 传入的元素类型 ， Int 是返回类型
    val f1 = new PartialFunction[Any,Int] {
      //实现 PartialFunction 的方法 isDefinedAt
      //1. 如果该方法返回true,就处理该元素
      override def isDefinedAt(x: Any): Boolean = {
        println("1")  // 5
        if (x.isInstanceOf[Int]) true else  false
      }

      //2. 如果 isDefinedAt 返回true,则系统调用 apply, 返回一个结果
      override def apply(v1: Any): Int = {
        println("2") //4
        v1.asInstanceOf[Int] + 1
      }
    }

    //说明
    //1. 直接定义成一方法(函数)
    //2. f2返回的类型是 PartialFunction[Any, Int]
    //3. case i: Int => i + 1 // case语句可以自动转换为偏函数
    def f2: PartialFunction[Any, Int] = {
      case i: Int => i + 1 // case语句可以自动转换为偏函数
    }


    //说明
    //如果传入一个偏函数，不能使用map,而是collect
    //val res = list.collect(f1) //
    val res = list.collect(f2)
    println("res=" + res)
    val res2 = list.collect { case i: Int => i + 1}
    println("res2=" + res2)

  }
}
