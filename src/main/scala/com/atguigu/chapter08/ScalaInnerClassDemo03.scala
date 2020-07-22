package com.atguigu.chapter08

object ScalaInnerClassDemo03 {
  def main(args: Array[String]): Unit = {
    //使用一下,创建一个内部类的实例
    val outer1 : ScalaOuterClass3 = new ScalaOuterClass3();
    val inner1 = new outer1.ScalaInnerClass3()

    inner1.info()
  }
}


class ScalaOuterClass3 {
  //这里的myouter 就是 ScalaOuterClass3一个别名
  //如果使用别名，需要将该外部类的属性和方法，放在最后
  myouter =>
  class ScalaInnerClass3 { //成员内部类
    def info() = { //内部类的方法
      // 访问方式：外部类名.this.属性名 ==改成=》  myouter.属性名
      println("name = " + myouter.name
        + " age =" + myouter.sal)
      myouter.cry()
    }
  }

  var name: String = "scott"
  private var sal: Double = 1.2
  private  def cry(): Unit = {
    println("cry ....:):)")
  }

}


object ScalaOuterClass3 { //伴生对象
class ScalaStaticInnerClass3 { //静态内部类
}

}

