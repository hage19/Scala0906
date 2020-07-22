package com.atguigu.chapter06.homework

object Exercise03 {
  def main(args: Array[String]): Unit = {
    //for(int i=10;i>=0;i–) System.out.println(i);
    for (i <- 0 to 10 reverse ) {
      println("i=" + i) // 10 ->0
    }
  }
}
