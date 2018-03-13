package com.example.zhou.myapplication.debug;

/**
 * Created by Zhou on 2017/11/8.
 */

public class Debug {


    public void debug(String args) {
        System.out.println(args);
    }

    public static void main(String[] args) {
        int result = (10 - 1) / 2;
        int result1 = (int) ((10.4 - 1) / 2);
        double result2 = (10 - 1) / 2;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}