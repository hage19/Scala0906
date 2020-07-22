package com.atguigu.chapter17.viewbounds

object MyImplicit {
  //隐式方法
  //1. 作用是将 Person2类型，隐式转成  Ordered[Person2]
  implicit def person22OrderedPerson2(person: Person2) =
    new Ordered[Person2] {
      override def compare(that: Person2): Int = person.age - that.age
    }

}
