package com.atguigu.chapter08

object ScalaInnerClassDemo02 {
  def main(args: Array[String]): Unit = {
    //使用一下,创建一个内部类的实例
    val outer1 : ScalaOuterClass2 = new ScalaOuterClass2();
    val inner1 = new outer1.ScalaInnerClass2()

    inner1.info()

  }
}


class ScalaOuterClass2 {
  var name: String = "scott"
  private var sal: Double = 1.2
  private  def cry(): Unit = {
    println("cry ....")
  }
  class ScalaInnerClass2 { //成员内部类
    def info() = { //内部类的方法
      // 访问方式：外部类名.this.属性名
      // 理解:外部类名.this 就是一个外部类实例，如果是java可能这样理解 ScalaOuterClass.class
      println("name = " + ScalaOuterClass2.this.name
        + " age =" + ScalaOuterClass2.this.sal)

      ScalaOuterClass2.this.cry()
    }
  }

}


object ScalaOuterClass2 { //伴生对象
class ScalaStaticInnerClass2 { //静态内部类
}

}

