package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

public class Service {


    public synchronized void fun1() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("fun1");

    }

    public void fun2() {
        synchronized (this) {
            System.out.println("fun2");
        }
    }


    static void test() {

        int x = 91;
        int y = 100;
        int i = 0;

        while (y > 0) {

            if (x > 0) {
                x = x - 10;
                y--;
            } else {
                x++;
            }
            System.out.println("循环次数" + i++);
        }
    }


    public static void main(String[] args) {
        Service.test();
    }
}
