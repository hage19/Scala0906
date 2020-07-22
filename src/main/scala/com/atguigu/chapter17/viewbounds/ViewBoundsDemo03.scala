package com.atguigu.chapter17.viewbounds

object ViewBoundsDemo03 {
  def main(args: Array[String]): Unit = {

    val p1 = new Person2("tom", 110)
    val p2 = new Person2("jack", 20)
    import MyImplicit._
    val compareComm3 = new CompareComm3(p1,p2)
    println(compareComm3.greater) //?
  }
}

//普通的Person2对象
class Person2(val name: String, val age: Int)  { //ocp
  override def toString = this.name + "\t" + this.age
}

class CompareComm3[T <% Ordered[T]](obj1: T, obj2: T) {
  def greater = if (obj1 > obj2) obj1 else obj2
}


