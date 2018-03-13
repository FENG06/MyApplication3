package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/23.
 */

public class Example24 {

    static {
        System.out.println("blcokB");
    }

    public static Example24 example24 = new Example24();

    {
        System.out.println("blockA");
    }



    public static void main(String[] args) {
        Example24 example241 = new Example24();
    }


}
