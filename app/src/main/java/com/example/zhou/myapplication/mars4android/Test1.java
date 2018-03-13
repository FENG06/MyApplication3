package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

public class Test1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

//        生成两个Thread对象，共用同一个线程体对象
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);

//        每一个线程都有名字，可以通过Thread对象的setNam方法设置线程名字，
//        也可以通过getName方法获取线程的名字
        t1.setName("线程a");
        t2.setName("线程b");

//        分别启动两个线程
        t1.start();
        t2.start();
    }
}

