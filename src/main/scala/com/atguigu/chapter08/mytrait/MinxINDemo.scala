package com.atguigu.chapter08.mytrait

object MixedINDemo {
  def main(args: Array[String]): Unit = {

    //说明
    //1. 在创建对象时，混入 特质
    //2. 这种方式只会对这里创建的对象的功能扩展，而不会影响到其他类
    var oracle = new OracleDB with Operate3 {
      override def sayHI(): Unit = {
        println("sayHi")
      }
    }
    oracle.insert(111)
    oracle.sayHI()
    //3.动态混入的本质，就是创建一个匿名子类
    // OracleDB oracle = new OracleDB() { public void insert(int id) { Operate3$class.insert(this, id); }

    //此种方式也可以应用于对抽象类功能进行扩展

    val mySQL = new MySQL3 with Operate3 {
      override def sayHI(): Unit = {
      }
      override def cry(): Unit = {
      }
    }


  }
}

trait Operate3 { //特质
  def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }

  def sayHI()
}

class OracleDB {
}

class KK extends OracleDB

abstract class MySQL3 {
  def cry()
}
