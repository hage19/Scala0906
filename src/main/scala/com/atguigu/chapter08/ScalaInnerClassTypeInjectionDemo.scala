package com.atguigu.chapter08




object ScalaInnerClassTypeInjectionDemo {
  def main(args: Array[String]): Unit = {
    //使用一下,创建一个内部类的实例
    val outer1 : ScalaOuterClass4 = new ScalaOuterClass4();
    val inner1 = new outer1.ScalaInnerClass4()

    val outer2 : ScalaOuterClass4 = new ScalaOuterClass4();
    val inner2 = new outer2.ScalaInnerClass4()

    inner1.test1(inner1) // ok
    println("---"+outer1)
    println()
    // error , 因为这里scala的内部类的对象类和外部类对象关联
    // 解决的方式就是使用类型投影
//    inner1.test1(inner2)
    inner1.test2(inner2)
    println(outer2)
  }
}


class ScalaOuterClass4 {
  //这里的myouter 就是 ScalaOuterClass4一个别名
  //如果使用别名，需要将该外部类的属性和方法，放在最后
  myouter =>
  class ScalaInnerClass4 { //成员内部类
    def info() = { //内部类的方法
      // 访问方式：外部类名.this.属性名 ==改成=》  myouter.属性名
      println("name = " + myouter.name
        + " age =" + myouter.sal)
      myouter.cry()
    }
    //test接收   ScalaInnerClass4
    //这里的  ScalaOuterClass4#ScalaInnerClass4 类型投影
    //它的作用是忽略对象的创建方式，只考虑类型
    def test1(ic: ScalaInnerClass4): Unit = {
      System.out.println(ic)
    }

    def test2(ic: ScalaOuterClass4#ScalaInnerClass4): Unit = {
      System.out.println(ic)
    }
  }

  var name: String = "scott"
  private var sal: Double = 1.2
  private  def cry(): Unit = {
    println("cry ....:):)")
  }

}


object ScalaOuterClass4 { //伴生对象
  class ScalaStaticInnerClass4 { //静态内部类
  }
}
