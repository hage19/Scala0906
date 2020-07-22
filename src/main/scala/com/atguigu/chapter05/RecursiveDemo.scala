package com.atguigu.chapter05

object RecursiveDemo {
  def main(args: Array[String]): Unit = {
    test(4)
  }

  def test (n: Int) {
    if (n > 2) {
      test (n - 1)
    }else {
      println("n=" + n) //
    }
  }

}
