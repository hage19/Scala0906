package com.atguigu.chapter08

object ChildGame {
  def main(args: Array[String]): Unit = {
    val child1 = new Child("白骨精")
    val child2 = new Child("蜘蛛精")
    val child3 = new Child("黄鼠狼精")


    Child.joinGame(child1)
    Child.joinGame(child2)
    Child.joinGame(child3)

    //输出
    Child.showInfo()

    Child.sayHi()
  }
}

//
//如果,设计一个var total Int表示总人数,我们在创建一个小孩时，就把total加1,并且 total是所有对象共享的就ok了!，我们使用伴生对象来解决

class Child(cName:String) { //伴生类
  var name = cName

  def sayOK(): Unit = {

  }
}

//将小孩总人数，放入 object Child
object Child {
  var totalNum = 0
  def joinGame(c:Child): Unit = {
    println(c.name + " 加入到游戏")
    totalNum += 1
  }
  def showInfo(): Unit = {
    printf("有%d个小孩玩游戏\n" , totalNum)
  }

  def sayHi(): Unit = {
    sayOk()
  }

  private def sayOk(): Unit = {
    printf("sayOk")
  }
}



