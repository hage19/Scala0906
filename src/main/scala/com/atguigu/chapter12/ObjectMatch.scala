package com.atguigu.chapter12

object ObjectMatch {
  def main(args: Array[String]): Unit = {

    // 模式匹配使用：
    //有时，我们需要去得到构建对象时的传入实参
    val number: Double = Square(6.0) //构建了 36.0
    number match {
      // 说明  case Square(n) 执行的过程
      //  1. 当执行到匹配  Square(n)
      //  2.  将 number 传递给  Square 的 def unapply(z: Double), number 会传入给z
      //  3. 如果 unapply 返回了Some 就表示匹配成功
      // 4.  如果unapply 返回了None 就表示匹配失败
      // 5. 将Some(?)的结果 返回给 case Square(n) 的 n值
      case Square(n) => println(n)
      //默认匹配
      case _ => println("nothing matched")
    }

  }
}

//这是一个object
object Square {

  //这里的unapply就是对象提取器
  def unapply(z: Double): Option[Double] = {
    println("unapply被调用~~")
    println("z=" + z) // 36.0
    //Some(math.sqrt(z)) // Some(6.0)
    None
  }



//创建对象的方法
  def apply(z: Double): Double = z * z
}
