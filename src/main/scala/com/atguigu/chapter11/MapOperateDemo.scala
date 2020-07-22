package com.atguigu.chapter11

object MapOperateDemo {
  def main(args: Array[String]): Unit = {


    val list = List(2, 4, 6) //集合
    //需求是把list的所有元素 * 2 ，并返回新的集合List

    //对list.map(f1)的使用的过程分析
    //1. 会遍历list的所有元素（Int)
    //2. 将遍历出的元素传递给f1(n:Int)
    //3. f1计算得到结果， 得到结果放入到新的集合，原来的集合并不变化
//    val list2 = list.map(f3(_))  //函数式编程
//    println("list2=" + list2)
//    println("list=" + list ) //
//

    println("===================================")
    val myList1 = MyList()
    val myList2 = myList1.map(f1)
    println("myList2=" + myList2)

   //什么情况下调用方法或者函数时，可以省略()
   //1. 如果是方法，当该方法没有形参，则调用该方法时，可以省略小括号
    f
    f()
    //2. 如果是一个函数，该函数没有形参，在调用该函数，不能省略()
    val f10 = () => {
      println("f10")
    }
    println(f10) //输出类型<function0>
    f10() //调用函数

    //3. 如果方法有隐式参数，则这时不带() , 带()就报错
    implicit  val n:Int = 10
    f9 //
    //f9()不能使用

  }


  def f9(implicit n:Int): Unit = {
    println("xxx" + n)
  }

  def f(): Unit = {
    println("xx")
  }

  //先写一个处理函数 元素 * 2
  def f1(n: Int): Int = {
    println("被调用~~")
    n * 2
  }

  implicit def f4(n:Int): Byte = {
    n.toByte
  }

  def f3(n:Byte): Byte = {
    n * 2
  }


  //假如继续处理
  def f2(n: Int): Double= {
      math.sqrt(n).formatted("%.2f").toDouble
  }


  //使用scala模拟一下map的运行机制->reduce->filter->flatmap


}

class MyList {
  var list1 = List(2,4,6)
  var list2 = List[Int]() // 返回的List[Int]

  //自己的map方法
  def map(f:(Int) => Int): List[Int] = {
    //遍历list1->调用f函数->封装到list2->返回
    for (item<- this.list1) {

      list2 = list2 :+ f(item)

    }
    list2
  }
}

object MyList {
  def apply(): MyList = new MyList()
}
