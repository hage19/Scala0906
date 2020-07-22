package com.atguigu.chapter15.service

import com.atguigu.chapter15.bean.Customer

import scala.collection.mutable.ArrayBuffer

import util.control.Breaks._

class CustomerService {
  var customerNums = 1
  //属性，保存所有的客户信息, 为了看效果， 我事先初始化一个客户
  val customers: ArrayBuffer[Customer] = ArrayBuffer(new Customer(1,"tom",'男',10,"110","tom@sohu.com"))

  //list 返回所有的客户信息
  def list(): ArrayBuffer[Customer] = {
    //
    customers
  }
  //添加客户 [增加客户]
  def add(customer:Customer) = {
    //假定客户的id是自增的.
    this.customerNums += 1
    customer.id = this.customerNums
    customers.append(customer)
    true
  }

  //完成删除客户的功能
  //编写一个方法，根据id->要删除的索引

  //规则
  //1. 如果有对应客户,就返回对应的索引
  //2. 如果没有客户,返回-1
  def findIndexById(id:Int): Int = { //返回要删除的索引
    var index = -1
    //遍历customers
    breakable {
      for (i <- 0 until customers.length) {
        if (customers(i).id == id) { //找到
          index = i
          break()
        }
      }
    }
    index
  }
  ////删除
  //1. 如果删除成功，返回true, 如果删除失败返回false
  def del(id:Int): Boolean = {
    val index = findIndexById(id) // 通过id 查找 对应index
    if (index == -1) {
      false
    } else {
      customers.remove(index)
      true
    }
  }
}
