package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise17 {


    int i = 0;

    Exercise17 increment() {
        i++;
        return this;
    }

    void print() {

        System.out.println("i = " + i);
    }

    public static void main(String[] args) {

        Exercise17 exercise17 =new Exercise17();
        exercise17.increment().increment().print();


    }


}
