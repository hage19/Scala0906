package com.atguigu.chapter15.homework

object Exercise01 {
  def main(args: Array[String]): Unit = {
    val pair = new Pair[String,Int]("hello", 100)
    val pair2 = pair.swap()
    println("pair2.t=" + pair2.t + " " + pair2.s ) // 100 hello

    val p3 = new Pair02[String]("hello", "world")
    val p4 = p3.swap()
    println(p4.t + " " + p4.s)

    val p5 = new Pair03[String,Int] ("abc", 99 )
    val p6 = p5.swap[String,Int](p5.t,p5.s)
    println(p6.t + " " + p6.s) // 99 abc

    val p7 = new Pair04[String,String]("tiger", "100")
    val p8 = p7.swap //隐式传递
    println(p8.s + " " + p8.t) // cat tiger

  }
}

final class Pair[T,S](val t:T,val s:S) {
  def swap() = {
    new Pair(s,t)
  }
}

class Pair02[T](val t:T, val s: T) {
  def swap() = new Pair(s,t)
}

class Pair03[T,S](val t:T, val s: S) {
  def swap[T,S](t:T,s:S) = new Pair(s,t) //在方法这里写入泛型
}

class Pair04[S,T](val s:S, val t: T) {
  //这里的 implicit env2 : S =:= T 的作用是通过泛型的约束实现隐式传递
  def swap(implicit env2 : S =:= T) = new Pair(s,t)
}