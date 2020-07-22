package com.atguigu.chapter07;

public class JavaPkg {

    public static void main(String[] args) {
//        //使用一下Dog
//        //小明的Dog
//        com.atguigu.chapter07.xm.Dog dog1 = new com.atguigu.chapter07.xm.Dog();
//        com.atguigu.chapter07.xq.Dog dog2 = new com.atguigu.chapter07.xq.Dog();
//
//        System.out.println(dog1); //
//        System.out.println(dog2); //

        String str = "abc";
        String str2 = "abc";
        System.out.println(str == str2);
        System.out.println(str.hashCode() + " " + str2.hashCode());

        A2 a2 =new A2() {
            @Override
            public void cry() {
                System.out.println("ok");
            }
        };

    }
}

abstract class A2{
    abstract public   void cry();
}

//interface MyInter {
//    abstract public void say();
//    public void sayHI() {
//        System.out.println("xx");
//    }
//}

