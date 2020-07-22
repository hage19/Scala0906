package com.atguigu.chapter08.mytrait

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
      val mySQL = new MySQL
      mySQL.insert(100)
  }
}
trait Operate {
  def insert( id : Int ): Unit = {
    println("保存数据="+id)
  }
}

trait DB extends Operate {
  //trait DB insert 重写了  Operate  insert
  //这时 override 不能去掉
  override  def insert( id : Int ): Unit = {
    println("向数据库中")
    super.insert(id) // 这里的 super.insert 调用的是 Operate的
  }
}
class MySQL extends DB {
}

