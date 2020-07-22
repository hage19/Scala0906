package com.atguigu.chapter12

object MatchDemo01 {
  def main(args: Array[String]): Unit = {

    val oper = '+'
    val n1 = 20
    val n2 = 10
    var res = 0
    //根据oper 的值，去执行对应的代码

    //匹配模式说明
    //1. match --- case 是匹配的基本结构
    //2. 如果匹配成功，就执行 case => 后面的代码, 执行后，就退出match
    //3. => 可以理解成就是类似 java  :
    //4. case _ 就是就默认匹配
    //5. 如果一个都匹配不到，又没有case _ ，则会抛出异常
    oper match {
      //在scala中，不需要break,只要执行一个case完毕后，就退出
      case '+' => {
        res = n1 + n2
        println("执行到+")
      }
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case 11 => {
        println("匹配到ok")
      }
      case _ => println("oper error") //默认匹配
    }
    println("res=" + res)


  }
}
