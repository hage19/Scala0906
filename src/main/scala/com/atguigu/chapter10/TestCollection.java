package com.atguigu.chapter10;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {


        //不可变集合类似java的数组
        int[] nums = new int[3];
        nums[2] = 11; //?
        //nums[3] = 90; //越界

        String[] names = {"bj", "sh"};
        System.out.println(nums + " " + names);

        //可变集合举例
        ArrayList al = new ArrayList<String>();
        System.out.println("al1.hashcode=" + al.hashCode());
        al.add("zs"); //ArrayList 增加一次，底层地址变化
        System.out.println(al + " " + al.hashCode()); //地址
        al.add("zs2");
        System.out.println(al + " " + al.hashCode()); //地址
        al.add("zs3");
        System.out.println(al + " " + al.hashCode()); //地址


    }
}
