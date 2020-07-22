package com.atguigu.chapter04

import scala.io.StdIn

object ForExercise05 {
  def main(args: Array[String]): Unit = {
    /*
    1)统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的   成绩从键盘输入]。
    2)统计三个班及格人数，每个班有5名同学。
    思路分析
    1. 定义必要的变量 classNum , classStuNum , classTotalScore ,  allClassTotalScore, passStuNum
       stuScore
    2. 因为我们没有学习数组, 必须接受到成绩后，立即计算
    3. 嵌套循环
    代码实现
     */
    val classNum = 3
    val classStuNum = 5
    var classTotalScore = 0.0
    var allClassTotalScore = 0.0
    var passStuNum = 0  //及格人数
    var stuScore = 0.0

    for (i <- 1 to classNum) {
      //清0
      classTotalScore = 0.0
      for (j <- 1 to classStuNum) {
        printf("请输入第%d班的%d学生的成绩\n", i, j)
        stuScore = StdIn.readDouble()
        if (stuScore >= 60.0) {
          passStuNum += 1
        }
        classTotalScore += stuScore //累计
      }
      allClassTotalScore += classTotalScore // 累计
      printf("%d班的平均成绩为%.2f\n", i, (classTotalScore / classStuNum))
    }

    printf("所有班级的总成绩为%.2f， 平均分%.2f\n",
      allClassTotalScore, allClassTotalScore / (classNum * classStuNum))

    printf("及格人数为%d \n", passStuNum)

  }
}
