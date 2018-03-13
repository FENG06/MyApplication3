package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

public class MyThread2 implements Runnable {

    private Service service;

    public MyThread2(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.fun2();
    }
}
