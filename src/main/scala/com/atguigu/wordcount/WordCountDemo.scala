package com.atguigu.wordcount

object WordCountDemo {
  def main(args: Array[String]): Unit = {
    /*
    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
使用映射集合，list中，各个单词出现的次数，并按出现次数排序
提示：分步完成
1. 扁平化 flatmap
2.
     */

    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd 谷歌 谷歌 uuu")
//    //1. 扁平化 flatmap
//    val res1 = lines.flatMap(_.split(" "))
//    println("res1=" + res1)
//    //2. 对他进行一个对偶映射 (atguigu,1)(atguigu,1).
//    val res2 = res1.map((_,1))
//    println("res2=" + res2)
//    //3. 做一个分组统计 (atguigu -> List((atguigu,1), (atguigu,1)))()
//    val res3 = res2.groupBy(_._1)
//    println("res3=" + res3)
//    //4. 统计各个key-val(List((),())) key->list.size
//    val res4 = res3.map(x=>(x._1,x._2.size))
//    println("res4=" + res4)
//    //5. 排序(从高到低)
//    val res5 = res4.toList.sortBy(_._2).reverse
//    println("res5=" + res5)

    //一步搞定
    //思考题： 请思考使用reduceLeft 简化.
    val res6 = lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).map(x=>(x._1,x._2.size)).toList.sortBy(_._2).reverse
    println("res6=" + res6)


  }
}

