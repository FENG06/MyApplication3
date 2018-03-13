package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

public class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("FirstThread-->" + i);

        }
    }


}
