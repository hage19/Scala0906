package com.atguigu.chapter01

object InputDemo {

  /*
  1.字符串通过+号连接（类似java）。
  2.printf用法 （类似C语言）字符串通过 % 传值。(格式化输出)
  3. 字符串通过$引用(类似PHP）。

   */
  def main(args: Array[String]): Unit = {
    val age = 10
    val sal = 8999.9151
    val name = "小王吧"
    //printf用法
    //1.说明 %.2f 进行四舍五入
    //如果要看 printf的底层, ctrl+b
    printf("信息如下 age = %d , sal = %.2f name=%s \n", age,sal,name)

    //当s"" 方式时，编译器对 字符串中的 $进行解析, 也可以进行方法调用
    //scala使用非常灵活
    println(s"信息如下 age = $age , sal = $sal name=$name")
    println(s"信息如下 age = ${age + 1} , sal = $sal name=$name info=${sayOk()}")

  }
  def sayOk(): String = {
    "你好 sayoK"
  }
}
