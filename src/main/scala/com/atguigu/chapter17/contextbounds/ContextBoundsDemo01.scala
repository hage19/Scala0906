package com.atguigu.chapter17.contextbounds

object ContextBoundsDemo01 {

  //这里我们使用隐式值
  //personComparetor 就是一个隐式值
  implicit val personComparetor = new Ordering[Person] {
    override def compare(p1: Person, p2: Person): Int =
      p1.age - p2.age
  }

  implicit val personComparetor2 = new Ordering[Person2] {
    override def compare(p1: Person2, p2: Person2): Int = {
      println("personComparetor2被调用~~")
      p1.age - p2.age
    }
  }


  def main(args: Array[String]): Unit = {

    //打印出 personComparetor地址
    println("1=" + personComparetor.hashCode()) //?

    //对于上下文界定，我们的使用方式较多，至少三种.
    val p1 = new Person("mary", 30)
    val p2 = new Person("smith", 35)
    val compareComm4 = new CompareComm4(p1, p2)
    println(compareComm4.geatter)

    val compareComm5 = new CompareComm5(p1, p2)
    println(compareComm5.geatter) // smith 35

    val p3 = new Person2("mary2", 32)
    val p4 = new Person2("smith2", 10)

    val compareComm6 = new CompareComm6(p3, p4)
    println(compareComm6.geatter) // smith 35


  }


}

//一个普通的Person类
class Person(val name: String, val age: Int) {
  override def toString = this.name + "\t" + this.age
}

class Person2(val name: String, val age: Int) {
  override def toString = this.name + "\t" + this.age
}

//方式1
//1. T 是 Ordering类型
//2. implicit comparetor: Ordering[T] 隐式参数
class CompareComm4[T: Ordering](obj1: T, obj2: T)(implicit comparetor: Ordering[T]) {
  def geatter = {
    println("2=" + comparetor.hashCode())
    if (comparetor.compare(obj1, obj2) > 0) obj1 else obj2
  }
}

//方式2：可以将隐式参数写到方法内
//方式2,将隐式参数放到方法内
class CompareComm5[T: Ordering](o1: T, o2: T) {
  def geatter = {
    //方法内，写了方法
    def f1(implicit cmptor: Ordering[T]) = cmptor.compare(o1, o2)

    if (f1 > 0) o1 else o2
  }
}

class CompareComm6[T: Ordering](o1: T, o2: T) {
  def geatter = {
    //这句话就是会发生隐式转换，获取到隐式值 personComparetor
    //将 隐式值 类型为 Ordering[T]， 赋给 comparetor，编译器
    //隐式语法糖，本质就是通过上下文，去找到隐式值.
    val comparetor = implicitly[Ordering[T]]

    if (comparetor.compare(o1, o2) > 0) o1 else o2
  }
}


