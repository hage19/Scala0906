package com.atguigu.temp

object Test {
  def main(args: Array[String]): Unit = {

//    val pair = new Pair[String,Int]("hello", 10)
//    val pair2 = pair.swap()
//    println(pair2.t + " " + pair2.s)

    val pair2 = new Pair2[String,Int]("smith", 11)
    val pair3 = pair2.swap(pair2.t,pair2.s)
    println(pair3.t + " "+ pair3.s )

//    val pair4 = new Pair4[String,Int]("hello", 11)
//    val k = pair4.swap
//    println(k.t + " " + k.s)
    //pair4.swap(pair4.s,pair4.t)
  }
}

final class Pair[T,S](val t:T,val s:S) {
  def swap() = {
    new Pair(s,t)
  }
}

class Pair2[T,S](val t:T, val s: S) {
  def swap[T,S](t:T,s:S) = new Pair(s,t)
}

class Pair4[S,T](val s:S, val t: T) {
  //这里swap,通过implicit要求ST
  def swap(implicit env2 : S =:= T) = new Pair(t,s)
}

