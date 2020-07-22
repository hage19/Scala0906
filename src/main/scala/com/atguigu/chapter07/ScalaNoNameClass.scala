package com.atguigu.chapter07

object ScalaNoNameClass {
  def main(args: Array[String]): Unit = {
//    val monster = new Monster { //alt + enter
//      override var name: String = "白骨精" //null
//
//      override def cry(): Unit = {
//        println(this.name + " 在玩耍。。")
//      }
//    }
//    monster.cry()

    testNothing()


  }

  def testNothing() {
    //空列表Nil(集合)的类型是List[Nothing]，它是List[T]的子类型，T可以是任何类。
    println(Nil.isInstanceOf[List[Nothing]]) // true
    val res = Nil
    println("res=" + res) // List()

    val cols: List[String] = Nil //
    val cols2: List[Int] = Nil //

    println(cols + " " + cols2)
  }
}

abstract class Monster {
  var name: String

  def cry()
}


