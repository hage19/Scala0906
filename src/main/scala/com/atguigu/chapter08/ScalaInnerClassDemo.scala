package com.atguigu.chapter08

object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {

    //使用
    //创建两个ScalaOuterClass实例
    val outer1 : ScalaOuterClass = new ScalaOuterClass();
    val outer2 : ScalaOuterClass = new ScalaOuterClass();

    //创建内部类对象
    // Scala创建内部类的方式和Java不一样，将new关键字放置在前，使用  对象.内部类  的方式创建
    // 注意，从这种创建方式我们可以看出: scala的内部类对象和外部类对象时关联的
    // 因为这个原因：scala有一个新的知识点->类型投影
    val inner1 = new outer1.ScalaInnerClass()
    val inner2 = new outer2.ScalaInnerClass()
    println(inner1)
    println(inner2)

    //创建静态内部类对象, 这个和java一样
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass()
    println(staticInner)


  }
}


class ScalaOuterClass { //伴生类 =》 外部类
class ScalaInnerClass { //内部类
}

}

object ScalaOuterClass { //伴生对象
class ScalaStaticInnerClass { //静态内部类
}

}

