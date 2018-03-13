package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

class MyThread implements Runnable {
    int i = 100;

    @Override
    public void run() {


        while (true) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + i);
                i--;
                Thread.yield();
                if (i <= 0) {
                    break;
                }
            }
        }
    }
}
