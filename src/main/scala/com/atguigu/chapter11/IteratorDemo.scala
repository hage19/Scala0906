package com.atguigu.chapter11

object IteratorDemo {
  def main(args: Array[String]): Unit = {

    //当我们需要使用while对某个集合进行遍历，需要先获取该集合的迭代器
    val iterator = List(1, 2, 3, 4, 5).iterator // 得到迭代器

    /*

     def iterator: Iterator[A] = new AbstractIterator[A] {
    var these = self
    def hasNext: Boolean = !these.isEmpty
    def next(): A =
      if (hasNext) {
        val result = these.head; these = these.tail; result
      } else Iterator.empty.next()

      说明
      1. 迭代器是 AbstractIterator 类的匿名子类
      2. 有hasNext方法，返回boolean, 返回是否为空
      3. next 就是取出当前指针指向的对象(元素)
     */
    println("--------遍历方式1 -----------------")
    while (iterator.hasNext) { //判断是否有下一个
      println(iterator.next()) //取出元素
    }
    println("--------遍历方式2 for -----------------")
    val iterator2 = List(11, 22, 33, 44, 55).iterator // 得到迭代器

    for(enum <- iterator2) {
      println(enum) //
    }


  }
}
