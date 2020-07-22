package com.atguigu.chapter08.mytrait

object TraitCreateSeq01 {
  def main(args: Array[String]): Unit = {
    //1. E...
    //2. A...
    //3. B....
    //4. C....
    //5. D....
    //6. F....
    val ff = new FF

    //动态混入的方式创建
    //1. 先将 KK创建起来，在混入
    //执行顺序
    // E..."
    // K....
    // A...
    // B..
    // c..
    // D....
    println("==============================")
    val ff2 = new KK2 with CC with DD

  }
}

trait AA {
  println("A...")
}
trait BB extends  AA {
  println("B....")
}
trait CC extends  BB {
  println("C....")
}
trait DD extends  BB {
  println("D....")
}
class EE {
  println("E...")
}
class FF extends EE with CC with DD {
  println("F....")
}
class KK2 extends EE {
  println("K....")
}

