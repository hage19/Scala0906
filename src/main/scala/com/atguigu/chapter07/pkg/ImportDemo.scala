package com.atguigu.chapter07.pkg

object ImportDemo {
  def main(args: Array[String]): Unit = {

    //scala支持给不同的类，在引入时取别名
    import java.util.{HashMap=>JavaHashMap}
    import scala.collection.mutable.HashMap
    var map = new HashMap() // 此时的HashMap指向的是scala中的HashMap
    var map1 = new JavaHashMap(); // 此时使用的java中hashMap的别名


  }


  def test2(): Unit = {
    import scala.collection.mutable.HashMap
    import java.util.{ HashMap=>_, _} // 含义为 引入java.util包的所有类，但是忽略 HahsMap类.
    var map = new HashMap() // 此时的HashMap指向的是scala中的HashMap, 而且idea工具，的提示也不会显示java.util的HashMaple


  }


  def test(): Unit = {

    import scala.collection.mutable.{HashMap,HashSet}
    var map = new HashMap()
    var set = new HashSet()

  }
}


class User {
  //import 语句可以在需要使用到包的使用在引入.
  //import 的作用域在代码块{}
  import scala.beans.BeanProperty
  @BeanProperty var  name : String = "" //ok
}
class Dog {

  //@BeanProperty var  name : String = "" //可以吗?
}
