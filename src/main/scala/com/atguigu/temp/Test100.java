package com.atguigu.temp;

public class Test100 {
    public static void main(String[] args) {

        System.out.println("ok~~~");
    }
}


class Ticket {
    public void sale() {

        synchronized (this) {
            //出票
        }
    }
}