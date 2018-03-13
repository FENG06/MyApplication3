package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * Created by Zhou on 2017/11/7.
 */

public class ExerciseP103_1 {

    public static void main(String[] args) {

        String [] a = {"1","2","3"};
        f("first","second","third");
        f(a);



    }

    private static void f(String... args) {
        System.out.println(Arrays.toString(args));
    }


}
