package com.atguigu.chapter10;

import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet<String>();
        hs.add("jack");
        hs.add("tom");
        hs.add("jack");
        hs.add("jack2");
        hs.add("han");
        hs.add("atguigu");
        System.out.println(hs);

    }
}
