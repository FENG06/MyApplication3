package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise21 {

    public static void main(String[] args) {

        Exercise21 exercise21 = new Exercise21();

        exercise21 = null;


        System.gc();

        System.out.println("--------分割线");

        System.runFinalization();

    }


    @Override
    protected void finalize() {
        System.out.println("测试finalize" + this.toString());
    }
}
