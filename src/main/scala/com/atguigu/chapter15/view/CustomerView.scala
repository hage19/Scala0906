package com.atguigu.chapter15.view

import com.atguigu.chapter15.bean.Customer
import com.atguigu.chapter15.service.CustomerService

import scala.io.StdIn
import util.control.Breaks._

class CustomerView {

  //设计两个变量
  var loop = true // 显示是否循环的显示菜单
  var key = ' ' // 表示用户输入的是什么选项
  val customerService = new CustomerService //创建了一个CustomerService对象
  //显示菜单的方法
  def mainMenu(): Unit = {

    do {
      println("")
      println("-----------------客户信息管理软件-----------------")
      println("                 1 添 加 客 户")
      println("                 2 修 改 客 户")
      println("                 3 删 除 客 户")
      println("                 4 客 户 列 表")
      println("                 5 退       出")
      println("请选择(1-5)：")
      key = StdIn.readChar()
      key match {
        case '1' => this.add() // 完善
        case '2' => println("修 改 客 户") // 完善
        case '3' => this.del() // 完善
        case '4' => this.list() // 完善
        case '5' => this.loop = false // 完善
      }

    } while (this.loop)

    println("你退出了软件....")
  }

  //显示客户列表
  //在CustomerView.scala 增加代码
  def list(): Unit = {
    //调用CustomerService的方法list,获取所有的客户
    val customers = customerService.list()
    //显示
    println()
    println("---------------------------客户列表---------------------------")
    println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱")
    //遍历显示customers的信息
    for (cutomer <- customers) {
      //重写Customer的toString方法，便于我们显示
      println(cutomer)
    }
    println("-------------------------客户列表完成-------------------------")

  }

  //添加客户的代码
  //CustomerView.scala
  def add(): Unit = {
    println()
    println("---------------------添加客户---------------------")
    println("姓名：")
    val name = StdIn.readLine()
    println("性别：")
    val gender = StdIn.readChar()
    println("年龄：")
    val age = StdIn.readShort()
    println("电话：")
    val tel = StdIn.readLine()
    println("邮箱：")
    val email = StdIn.readLine()

    //构建对象
    val customer = new Customer(0, name, gender, age, tel, email)
    //调用service方法
    customerService.add(customer)
    println("---------------------添加成功---------------------")

  }

  //编写一个del方法
  def del(): Unit = {
    println("-------------删除客户------------")
    println("请输入删除的编号(-1表示退出)")
    val id = StdIn.readInt()
    if (id == -1) { //
      println("-------------删除没有完成------------")
      return
    }
    var choice = ' '
    breakable {
      do {
        println("请确认是否删除(Y/N)")
        choice = StdIn.readChar().toLower
        if (choice == 'y' || choice == 'n') {
          break()
        }

      } while (true)
    }

    //再次做判断
    if (choice == 'y') {
      //调用customerService的del方法
      //this.customerService.del(id)
      if(this.customerService.del(id)) {
        println("-------------删除成功------------")
      }else {
        println("-------------id不存在,删除没有完成------------")
      }
    }else {
      println("-------------删除没有完成------------")
    }

  }

}
