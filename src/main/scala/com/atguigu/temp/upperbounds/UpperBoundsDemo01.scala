package com.atguigu.temp.upperbounds




object UpperBoundsDemo01 {
  def main(args: Array[String]): Unit = {

//    Predef
//
//    val compare1 = new CompareComm(Integer.valueOf(10), Integer.valueOf(20))
//    println(compare1.greater)
//    val compare2 = new CompareComm[java.lang.Float](103.1f, 20.1f)
//    println(compare2.greater)
  }
}

class CompareInt(n1: Int, n2: Int) {
  def greater = if (n1 > n2) n1 else n2
}



