package com.atguigu.chapter03

object ArithmeticExercise01 {
  def main(args: Array[String]): Unit = {
    //假如还有97天放假，问：xx个星期零xx天
    val days = 97
    printf("假如还有97天放假，问：%d个星期零%d天\n", days / 7, days % 7)

    //定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度, 结果保留到小数点两位。[测试：232.5]
    //思路
    //1. 定义两个变量，分别保存 华氏温度和摄氏温度
    //2. 套用公式

    val huashi = 232.5
    val sheshi = 5.0 / 9 * (huashi - 100)
    println("huashi=" + huashi + " sheshi=" + sheshi.formatted("%.2f"))


  }
}
