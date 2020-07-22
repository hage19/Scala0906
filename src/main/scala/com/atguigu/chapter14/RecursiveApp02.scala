package com.atguigu.chapter14

object RecursiveApp02 {
  def main(args: Array[String]): Unit = {
    def reverse(xs: String): String =
      if (xs.length == 1) xs else reverse(xs.tail) + xs.head

    println(reverse("Hello")) // olleH
  }
}
