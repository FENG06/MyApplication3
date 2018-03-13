package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

public class MyThread1 implements Runnable {

    private Service service;

    public MyThread1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.fun1();
    }
}
