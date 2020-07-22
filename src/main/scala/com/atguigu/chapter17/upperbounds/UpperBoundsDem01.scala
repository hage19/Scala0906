package com.atguigu.chapter17.upperbounds

object UpperBoundsDem01 {
  def main(args: Array[String]): Unit = {

    val compareInt = new CompareInt(10,30)
    println(compareInt.greater) // 30

    val compareFloat = new CompareFloat(1.1f, 7.1f)
    println(compareFloat.greater) // 7.1f

    //使用上界来完成比较

    val compareComm1 = new CompareComm(Integer.valueOf(20), Integer.valueOf(40))
    println(compareComm1.greater) //

    val compareComm2 = new CompareComm(java.lang.Float.valueOf(20.1f), java.lang.Float.valueOf(42.3f))
    println(compareComm2.greater) //

    //上界的简洁的语法
    val compareComm3 = new CompareComm[java.lang.Float](23.1f, 142.3f)
    println(compareComm3.greater) // 142.3f

  }
}

//一个类 CompareInt
//1. 接收 两个Int
//2. 一个方法 greater 返回较大的值
class CompareInt(n1: Int, n2: Int) {
  def greater = if(n1 > n2) n1 else n2
}

//传统写法，如果比较Float
class CompareFloat(n1: Float, n2: Float) {
  def greater = if(n1 > n2) n1 else n2
}

//使用上界来完成
//1. T <: Comparable[T] 就是一个上界的语法
//2. 表示的含义是 T 是  Comparable[T] 子类型
//3. T 是实现了  Comparable 接口
//4. 好处是只要 Int ,Float, Long,等他们实现了Comparable,就可以统一调用
class CompareComm[T <: Comparable[T]](obj1: T, obj2: T) {

  def greater = if(obj1.compareTo(obj2) > 0) obj1 else obj2
}


