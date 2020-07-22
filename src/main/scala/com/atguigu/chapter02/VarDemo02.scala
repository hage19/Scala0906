package com.atguigu.chapter02

object VarDemo02 {
  def main(args: Array[String]): Unit = {

    //需求1：从数据表中，查询到dog信息, 修改name在重写写入到数据库中
    val dog = new Dog
    dog.name = "tom"

    //需求2：从数据表中，查询到dog信息, 希望将dog 指向另外一个dog对象
    var dog2 = new Dog
    dog2 = dog

  }
}


class Dog {
  var name:String = "jack" // 可变 , _ 表示给一个默认值
  val age :Int = 10 // age是不可以变, _ 表示默认值 0
}