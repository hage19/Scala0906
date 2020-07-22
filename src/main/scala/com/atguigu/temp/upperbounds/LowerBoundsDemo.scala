package com.atguigu.temp.upperbounds


object LowerBoundsDemo {
  //定义一个隐式值
  implicit val personComparetor = new Ordering[Person3] {
    override def compare(p1: Person3, p2: Person3): Int = {
      println("xxxx~hello")
      p1.age - p2.age
    }
  }
  def main(args: Array[String]): Unit = {

    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")

    val res1 = lines.flatMap(_.split(" "))
    println(res1)
    val res2 = res1.map((_,1))
    println("res2=" + res2)
    val res4 = res2.groupBy(_._1)
    println("res4=" + res4)
    val res5 = res4.map((x:(String,List[(String,Int)]))=>(x._1,x._2.size))
    println(res5.toList.sortBy((x:(String,Int))=>x._2).reverse)


  }

}

class Temp3[-A](title: String) { //Temp3[+A] //Temp[-A]
  override def toString: String = {
    title
  }}
//支持协变
class Super
class Sub extends Super

//方式1
class CompareComm4[T: Ordering](obj1: T, obj2: T)(implicit comparetor: Ordering[T]) {
  println("xx" + comparetor.hashCode())
  def geatter = if (comparetor.compare(obj1, obj2) > 0) obj1 else obj2
}


//一个普通的Person类
class Person3(val name: String, val age: Int) {
  override def toString = this.name + "\t" + this.age
}

class Person4(val name: String, val age: Int) {
  override def toString = this.name + "\t" + this.age
}


