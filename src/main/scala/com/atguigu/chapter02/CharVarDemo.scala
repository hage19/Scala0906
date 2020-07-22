package com.atguigu.chapter02

object CharVarDemo {
  def main(args: Array[String]): Unit = {
    val c:Char = 97
    //这里输出的是97 码值对应的字符
    println("char=" + c) // 'a'

    //var c2 : Char =  'a' + 1 错误 Int->Char

    //如下修改，就可以
    var c2 : Char =  ('a' + 1).toChar
    var c3 : Long =  'a' + 1
    var c4 = "hello c4"
    println(s"C2: $c2")
    printf("C3: %s ",c4)
  }
}
