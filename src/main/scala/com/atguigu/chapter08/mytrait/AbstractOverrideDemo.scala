package com.atguigu.chapter08.mytrait

object AbstractOverrideDemo {
  def main(args: Array[String]): Unit = {
    println("abc")

    val mysql5 = new MySQL5 with DB5  with File5 //ok!
    //将数据保存到文件中..
    //将数据保存到数据库中..
    mysql5.insert(100)

//    val mysql6 = new MySQL5 with  File5 with DB5 //
//
//    mysql6.insert(100)

  }
}

trait Operate5 {
  def insert(id: Int)
}

trait File5 extends Operate5 {
  //一旦使用了重写抽象方法，则必须考虑动态混入的顺序
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中..")
    super.insert(id)
  }
}

trait DB5 extends Operate5 {
  def insert(id: Int): Unit = {
    println("将数据保存到数据库中..")
  }
}

class MySQL5 {}


