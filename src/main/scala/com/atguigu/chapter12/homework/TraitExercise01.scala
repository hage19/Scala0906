package com.atguigu.chapter12.homework


import java.awt.geom.Ellipse2D

trait RectangleLike { //特质
  this: Ellipse2D.Double =>
  def translate(x: Double, y: Double) { //方法
    this.x = x
    this.y = y
  }

  def grow(x: Double, y: Double) {
    this.x += x //增加,如果传入的是负数，就是减小
    this.y += y //增加
  }
}

object Test extends App { //扩展了App
  //动态混入了 RectangleLike
  //
  val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  println("x = " + egg.getX + " y = " + egg.getY) //
  egg.translate(10, -10) //使用特质中的方法
  println("x = " + egg.getX + " y = " + egg.getY)
  egg.grow(10, 20) //特质的方法
  println("x = " + egg.getX + " y = " + egg.getY) // 20.0  10.0
}