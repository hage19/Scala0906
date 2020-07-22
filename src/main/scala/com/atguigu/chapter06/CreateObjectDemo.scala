package com.atguigu.chapter06

object CreateObjectDemo {
  def main(args: Array[String]): Unit = {
    val worker = new Worker // worker 就是Worker

    //使用多态, new Worker  ,对象赋给 Emp 变量
    val emp: Emp = new Worker // emp


  }
}


class Emp  //空类
class Worker extends Emp //空类
