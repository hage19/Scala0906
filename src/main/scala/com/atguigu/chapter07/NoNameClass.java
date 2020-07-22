package com.atguigu.chapter07;

public class NoNameClass {
    public static void main(String[] args) {

        //java中匿名子类的创建方式
        A22 a22 = new A22() {
            @Override
            public void cry() {
                System.out.println("cry....");
            }
        };
        a22.cry();
    }
}

abstract class A22 {
    abstract public void cry();
}

