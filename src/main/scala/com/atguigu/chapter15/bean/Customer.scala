package com.atguigu.chapter15.bean

class Customer {
  var id: Int = _
  var name: String = _
  var gender: Char = _
  var age: Short = _
  var tel: String = _
  var email: String = _

  //使用辅助构造器完成构建
  def this(id:Int, name:String,gender:Char,age:Short,tel:String,email:String) {
    this
    this.id = id
    this.name = name
    this.gender = gender
    this.age = age
    this.tel = tel
    this.email = email
  }
  //重写了toString
  override def toString: String = {
    s"$id\t\t$name\t\t$gender\t\t$age\t\t$tel\t\t$email"
  }
}
