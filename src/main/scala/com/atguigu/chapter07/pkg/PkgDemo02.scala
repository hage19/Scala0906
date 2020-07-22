//说明
//1. 在一个.scala中可以同时创建多个包
//2. 而且可以在不同包下，创建类

package com.atguigu.aaa {

  //编译后 对于 object Test 会生成两个.class文件
  //1. class Test  => 伴生类 （空） com.atguigu.aaa.Test
  //2. calss Test$ => 伴生对象  com.atguigu.aaa.Test$
  object Test {
    def main(args: Array[String]): Unit = {
      println("测试包第一个案例..")
      //父包使用子包的Tiger,需要import
      import com.atguigu.aaa.scala.Tiger
      val tiger = new Tiger
    }
  }

  class Cat // 就会在编译后 com.atguigu.aaa

  package object scala { //这个就是com.atguigu.aaa.scala 对应的包对象
    val name = "jack"
    def sayOk(): Unit = {
      println("jack sayOk")
    }
    val f1 = () => {
      println("f1函数")
    }
  }

  package scala { // 这个又是一个包 com.atguigu.aaa.scala

    //在这个scala中，希望可以使用自己再该包中定义的方法，函数或者变量
    //这时，我们可以将 方法，函数或者变量 写入到该包对应的包对象中


    class Tiger // 就会在编译后 com.atguigu.aaa.scala
    class Cat // com.atguigu.aaa.scala.Cat
    object TestCat {
      def main(args: Array[String]): Unit = {

        //因为object TestCat 在  com.atguigu.aaa.scalaz中，因此就可以使用
        //  com.atguigu.aaa.scala 包对应的包对象中定义的内容(原理后面说)
        println("name=" + name)
        sayOk()
        f1()
//
//        //在子包中，可以直接使用父包的内容
//        //如果本包有相同类名，则使用就近原则
//        val cat1 = new Cat
//        println("cat1=" + cat1)
//
//        //如果希望使用父类的类，则带上类路径
//        val cat2 = new com.atguigu.aaa.Cat
//        println("cat2=" + cat2)
      }
    }
  }

  package scala2 {

  }

  //包可以嵌套定义，但是推荐不要超过3层
  package scala3 {

    package hhh {

        class Dog

    }
  }
}




