package com.atguigu.chapter06

import scala.beans.BeanProperty

object PropertiesDemo {
  def main(args: Array[String]): Unit = {
//    val monster3 = new Monster3("jack")
//    monster3.name = "红孩儿"
//    println(monster3.name)

    val car = new Car
    car.name = "奔驰800"
    car.setName("hello")

    println(car.name) // car.name()
    println(car.getName) // car.getName()
  }
}

class Car {
  //说明
  //1.当给某个属性增加了  @BeanProperty ， 会生成对应的 setName 和 getName
  //2.并且和以前的name() 和 name_$eq() 不冲突
  @BeanProperty var name :String = "宝马700"
}


class Monster(name:String) { // public MOnster(String name) {}

}

//如果val name:String
//1. val name:String => private String name
//2. public String name() { name }

/*
public class Monster2
{
  private final String name;

  public String name()
  {
    return this.name;
  }

  public Monster2(String name)
  {
  }
}
 */
class Monster2(val name:String) {

}
/*
public class Monster3
{
  private String name;

  public String name()
  {
    return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }


  public Monster3(String name)
  {
  }
}
 */
class Monster3(var name:String)
