package com.atguigu.chapter17.viewbounds

object ViewBoundsDemo {
  def main(args: Array[String]): Unit = {

    //这时，我们可以直接传入 Int
    val compareComm1 = new CompareComm(20,30)
    println(compareComm1.greater) // 30

    val compareComm2 = new CompareComm(202.1f,301.1f)
    println(compareComm2.greater) // 301.1f

    //以前在上界的各种用法仍然ok
    val compareComm3 = new CompareComm(java.lang.Float.valueOf(1.1f),java.lang.Float.valueOf(9.1f))

    val compareComm4 = new CompareComm[java.lang.Float](1.1f,9.1f)




  }
}

//说明
//1. [T <% Comparable[T]] 视图界定
//2. T 是 Comparable[T] 子类型
//第一种情况： T 是实现了 Comparable 类型
//第二种情况： 如果T没有实现 Comparable, 会自动的引入隐式转换来实现 scala包
//  Predef 的对象,比如implicit def int2Integer(x: Int): java.lang.Integer

class CompareComm[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
