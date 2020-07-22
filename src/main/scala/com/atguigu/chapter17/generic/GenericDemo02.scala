package com.atguigu.chapter17.generic

import com.atguigu.chapter17.generic.SeasonEm.SeasonEm

object GenericDemo02 {
  def main(args: Array[String]): Unit = {
    val englishClass1 = new EnglishClass[SeasonEm, String, String](SeasonEm.spring, "大数据0906", "高级班")
    val englishClass2 = new EnglishClass[SeasonEm, String, Int](SeasonEm.autumn, "JAVAEE0101", 1)
    println(englishClass2.classSeason + " " + englishClass2.className + englishClass2.classType)
  }
}

/*
要求
1.请设计一个EnglishClass (英语班级类)，在创建EnglishClass的一个实例时，需要指定[ 班级开班季节(spring,autumn,summer,winter)、班级名称、班级类型]
2.开班季节只能是指定的，班级名称为String, 班级类型是(字符串类型 "高级班", "初级班"..) 或者是 Int 类型(1, 2, 3 等)
3.请使用泛型来完成本案例.

 */
// Scala 枚举类型
object SeasonEm extends Enumeration {
  type SeasonEm = Value //自定义SeasonEm，是Value类型,这样才能使用
  val spring, summer, winter, autumn = Value
}

class EnglishClass[A, B, C](val classSeason: A, val className: B, val classType: C)