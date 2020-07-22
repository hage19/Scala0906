package com.atguigu.chapter12

object GoodsSale {
  def main(args: Array[String]): Unit = {
    //说明, 下面是一个具体的打折案例
    //手动计算:Book("漫画", 40) =  40 - 10 = 30
    // Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)) = 80 + 30 - 20 = 90
    // 总额是  30 + 90 = 120
    val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30))) //统计打折后的价格


    //思路
    //1. 首先需要将 单个商品和打包的商品的 （原价计算(求和) - 打折金额） 递归
    //2. 使用递归
    //3. 使用到对象匹配

    //知识点1:
    /*
    请思考：如何取出
val sale = Bundle("书籍", 10,  Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))
这个嵌套结构中的 "漫画"
     */

    val res1 = sale match {
      case Bundle(_, _, Book(desc, _), _*) => desc
    }
    println("res1=" + res1)

    //知识点2
    /*
    请思考：如何将 "漫画" 和

val sale = Bundle("书籍", 10,  Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))
这个嵌套结构中的 "漫画" 和 紫色的部分 绑定到变量，即赋值到变量中
     */


    val res2 = sale match {
        //说明
        //1.  book @ Book(_, _) 表示将 Book(_, _) 对象 赋给  book,
        //2. items @  _* 表示将 后面所有的赋给 items (WrappedArray)
      case Bundle(_, _, book @ Book(_, _), items @  _*) => (book, items)
    }
    println("res2=" + res2)
    //如果希望取出book的价格和描述
    println("book.desc=" + res2._1.description + " book.price=" + res2._1.price)

    //知识点3-不使用_*绑定剩余Item到rest
    /*
  请思考：如何将 "漫画" 和 紫色部分

  val sale = Bundle("书籍", 10,  Article("漫画", 40), Bundle("文学作品", 20, Article("《阳关》", 80), Article("《围城》", 30)))
  这个嵌套结构中的 "漫画" 和 紫色的部分 绑定到变量，即赋值到变量中
     */
    val res3 = sale match {
      //说明
      //1.  book @ Book(_, _) 表示将 Book(_, _) 对象 赋给  book,
      //2. items 表示将 后面所有的赋给 items (Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0)))))
      case Bundle(_, _, book @ Book(_, _), items ) => (book, items)
    }
    println("----------------------------------")
    println("res3=" + res3)








    //有了前面基础后，我们可以完成代码
    /*
    最佳实践案例-商品捆绑打折出售

  现在有一些商品，请使用Scala设计相关的样例类，完成商品可以捆绑打折出售。要求
  商品捆绑可以是单个商品，也可以是多个商品。
  打折时按照折扣xx元进行设计.
  能够统计出所有捆绑商品打折后的最终价格

     */

    //说明, 下面是一个具体的打折案例
    //手动计算:Book("漫画", 40) =  40 - 10 = 30
    // Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)) = 80 + 30 - 20 = 90
    // 总额是  30 + 90 = 120
    val sale2 = Bundle("书籍", 10, Book("漫画", 50), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30))) //统计打折后的价格

    println("总价为=" + price(sale2)) // 120.0

    //分析执行的流程
    //

  }
  //写出一个方法，来统计 sale2的总价(打折后)
  def price(item :Item): Double = {
    item match { //匹配是针对 item
      case Book(_, p) => p
      case Bundle(_, discount, items@_*) => items.map(price).sum - discount // (40,70).sum - 10
    }
  }
}


abstract class Item // 项(抽象类) ，下面可以有很多子类
//这里我们创建了Book样例类，当然你也可以写其他, extends Item, description 描述, price 价格
case class Book(description: String, price: Double) extends Item

//Bundle 捆, 表示书可以打包销售 , discount: 打折金额, item: Item* 可以有多个
case class Bundle(description: String, discount: Double, item: Item*) extends Item
