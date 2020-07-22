package com.atguigu.chapter12.homework

object EnumTest {
  def main(args: Array[String]): Unit = {
    //比如我们自定义一个类型MyInt
    type MyInt = Int //MyInt就是可以当做Int
    val num: MyInt = 10
    println(num.isInstanceOf[Int]) //? true
    println(num.isInstanceOf[MyInt]) //? true

    //println(Suits)
    //println(Suits.)
    //Suits.
    println(Suits.Club + " " + Suits.Diamond)
    println(Suits) // Suits$.MODULE$

    println(Suits.isRed(Suits.Diamond)) // true
    println(Suits.isRed2(Suits.Spade)) // false
  }
}

object Suits extends Enumeration{
  type Suits = Value // 自定义了一个类型，是Suits ，type

  //创建了四个属性,静态属性, 体现出枚举是在当我们通过Suits 去获取属性时，只能有四种

  val Spade = Value("♠") // 红桃
  val Club = Value("♣") //...
  val Heart = Value("♥") //..
  val Diamond = Value("♦")//..
  //重写toString方法
  override def toString():String={ // 重写了Suits 的toString
    Suits.values.mkString(",") //取出所有的枚举值，然后mkString
  }


  //isRed
  def isRed(card: Suits) = card == Heart || card == Diamond
  def isRed2(card: Value) = card == Heart || card == Diamond
}
