package com.atguigu.chapter15.app

import com.atguigu.chapter15.view.CustomerView

object CustomerApp {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }
}
