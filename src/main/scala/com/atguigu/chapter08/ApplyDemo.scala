package com.atguigu.chapter08

object ApplyDemo {
  def main(args: Array[String]): Unit = {
    //在伴生对象中定义apply方法，可以实现： 类名(参数) 方式来创建对象实例. 
    
    val arr = Array[Int](10,10) //底层使用的伴生对象的apply
    
    val car = new Car("奔驰", 9.3)

    //步骤
    //1. 会去调用 object Car 的 apply 方法， 会根据 参数来对应apply
    //2. 即apply可以重载
    var car2 = Car("宝马",10.1)
    println(car2) //

    val car3 = Car("奔驰")
    println(car3)
  }
}


class Car(cName:String, cPrice:Double) {
  var name = cName
  var price = cPrice
  val price1 = cPrice

  override def toString: String = {
    s"信息如下 : ${this.name} ${this.price}\n"
  }

  def this(cName:String) {
    this(cName, 88.8)
  }
}

object Car {
  def apply(cName: String, cPrice: Double): Car = new Car(cName, cPrice)

  def apply(cName: String): Car = new Car(cName)

}
