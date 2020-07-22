package com.atguigu.chapter06

object PropertyDemo {
  def main(args: Array[String]): Unit = {

//    val p1 = new Person
//
//    println(p1.age + p1.sal + p1.Name + " " + p1.address)

    /*println(p1.address == null) // true [String]
    println(p1.Name == null) // true [Null]
    println(p1.lover == null) // true [Person]*/




  //调用父类无参够造
//  var zi=new Zi
//   zi.name="开始"
//   zi.age=22
//   zi.show()
//  调用父类有参够造
  var zi1=new Zi1
  zi1.name="开始"
  zi1.age=22
  zi1.show()
  }
}
  class Fu{
    println("这是父类主够造器")
    var name:String=_
    var age:Int=_
    def this(name:String,age:Int){
      this()
      this.name=name
      this.age=age
      println("父类的辅助构造器"+ name + age)
  }

  }
  //调用父类的无参够造器
  class Zi(gender:Int) extends Fu{
    println("子类的主构造器")
    def this(){
      this(1)
      println("子类的辅助构造器")
  }
    def show(){
    println(s"name:$name,age:$age,gender:$gender")
    }
  }
  //调用父类的有参够造器
  class Zi1(name:String,age:Int,gender:Int) extends Fu(name:String,age:Int){
    println("子类的主构造器")

    def this(){
      this("wangmign",10,1)
    println("子类的辅助构造器")
  }
  def show(){
  println(s"name:$name,age:$age,gender:$gender")

  }
}




class Person {
  var age: Int = 10
  var sal = 8090.9
  var Name = null //Name的类型  Null
  var address: String = null // address 是 String
  var lover: Person = _ //  当我们给一个对象一个 _ 默认值，也是 null

}

