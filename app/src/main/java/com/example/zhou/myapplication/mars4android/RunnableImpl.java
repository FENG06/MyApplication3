package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

public class RunnableImpl implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("RunnableThread-->" + i);
            if (i == 50) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
