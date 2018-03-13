package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

public class Test {
    public static void main(String[] args) {
//
//        //        生成线程类的对象
//        FirstThread ft = new FirstThread();
//        //        启动线程，进入就绪状态，不代表程序立即可以执行，需要抢占CPU资源
//        ft.start();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println("MainThread-->" + i);
//
//        }
//

        //生成一个Runnable接口实现类的对象
        RunnableImpl ri = new RunnableImpl();

        //生成一个Thread对象，并将Runnable接口实现类的对象作为参数
        // 传递给该Thread对象
        Thread t = new Thread(ri);

        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        System.out.println(t.getPriority());
        //通知Thread对象，执行start方法
    }
}
