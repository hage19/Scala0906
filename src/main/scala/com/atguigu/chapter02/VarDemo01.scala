package com.atguigu.chapter02

object VarDemo01 {
  var num1 = 10 // private int num1;
  val num2 = 20 //底层 private final int num2;
  def main(args: Array[String]): Unit = {


    var age: Int = 1 // 在scala中，变量需要显示的初始化
    //说明
    //1. var是一个关键字，表示name是一个变量(是可变变量), 如果要去变量不可变，则使用val 修饰
    //   这样可以根据实际的开发需求，来规定我们的变量是可变的还是不可变，提供效率
    //Java =》 集合
    //2. 变量名和 类型直接需要：间隔
    var name: String = "tom"

    // 类型推断, className 就是String ,类型就确定了
    var className = "尚硅谷0906班"

    //在idea看一个数据的类型
    println("className=" + className)

    //类型确定后，就不能修改，说明Scala 是强数据类型语言
    //className = 10

    //在声明/定义一个变量时，可以使用var 或者 val 来修饰， var 修饰的变量可改变，val 修饰的变量不可改
    //1. 更加代码的逻辑确定使用var 还是val
    //2. scala 推荐尽量使用val
    val tax_rate = 0.08 // tax_rate 就是不可变
    //tax_rate = 0.09,错误
    var salary = 88888
    salary = salary + 1 // var 可以变化


  }
}
