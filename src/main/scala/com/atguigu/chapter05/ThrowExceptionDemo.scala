package com.atguigu.chapter05

object ThrowExceptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      test()
    } catch {
      case ex:Exception => {
        println("异常的信息=" + ex.getMessage)
      }
    } finally {
      //资源的是否和关闭，可以将这部分代码写到这里.
      println("finally被执行~~")
    }

    println("go on...")
  }

  def test(): Nothing = {
    throw new Exception("我自定义的异常")
  }
}
