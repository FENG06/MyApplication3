package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/1.
 */

public class Exercise2 {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Need 3 Arguments");
            System.exit(2);
        }

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);


    }


}
