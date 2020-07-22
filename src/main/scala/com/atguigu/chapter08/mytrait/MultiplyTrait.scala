package com.atguigu.chapter08.mytrait

object MultiplyTrait {
  def main(args: Array[String]): Unit = {
    /*
    //动态混入时，先继承，然后混入了两个特殊
    //？mysql 对象的构建顺序如何？答: 从左到右
    //Operate4...
    //Data4
    //DB4
    //如果发现某个父特质，已经被构建了，则不会重复构建
    //File4
    val mysql = new MySQL4 with DB4 with File4

    //1.Scala在叠加特质的时候，会首先从后面的特质的方法开始执行
    //2.Scala中特质中如果调用super，并不是表示调用父特质的方法，而是向前面（左边）继续查找特质，如果找不到，才会去父特质查找
    //3. 如何理解? => 因为动态混入去创建对象时，其实本质是一个匿名子类，动态混入创建的对象时
    //动态的对象，那么它的继承关系，就不一定是静态的关系，而是一个动态
    //向文件..
    //向数据库
    //插入数据 = 100
    mysql.insert(100)

    //请写出构建mysql2的顺序
    //Operate4...
    //Data4
    //File4
    //DB4
    println("======================")
    val mysql2 = new MySQL4 with File4 with DB4

    //向数据库
    //向文件
    //插入数据 = 200
    mysql2.insert(200)*/


    //如果 trait File4 中，修改了 代码 super.insert(id) 改成 super[Data4].insert(id)
    val mysql3 = new MySQL4 with DB4 with File4
    //1. 向文件
    //2. 插入数据 = " + 300
    mysql3.insert(300)

  }
}

trait Operate4 { //特质
  println("Operate4...")
  def insert(id : Int)
}

trait Data4 extends Operate4 {
  println("Data4")
  override  def insert(id : Int): Unit = {
    println("插入数据 = " + id)
  }
}

trait DB4 extends Data4 {
  println("DB4")
  override def insert(id : Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File4 extends  Data4 {
  println("File4")
  override def insert(id : Int): Unit = {
    println("向文件")
//    super[Data4].insert(id)
    super.insert(id)
  }}
class MySQL4 {
  println("MySQL4")
} //空类



