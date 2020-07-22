package com.atguigu.chapter07.myextends

object ScalaPropertyOverride {
  def main(args: Array[String]): Unit = {

    val obj : AAAA = new BBBB()
    val obj2 : BBBB = new BBBB()
    println(obj.age)  // obj.age()  20
    println(obj2.age) // obj2.age() 20

    println(obj2.asInstanceOf[AAAA].age) // 20

  }
}

class AAAA {
  val age : Int = 10 //private age => public age()
}

class BBBB extends AAAA {
  override val age : Int = 20 // private => public age()
}

