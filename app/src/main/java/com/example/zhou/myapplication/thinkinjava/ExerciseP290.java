package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/17.
 */

public class ExerciseP290 {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        float a = 11;
        float b = 11.1f;
//        The old way
        System.out.println(("Row1: [" + x + " " + y + "]"));
//        The new way
        System.out.format("Row1: [%d %f]\n", x, y);
//        or
        System.out.printf("Row1: [%d %f]\n", x, y);


        System.out.println("----------------------------");
        float f = 2.2f;
        double d = (double) f;
        System.out.println(d);
        f = 2.25f;
        d = (double) f;
        System.out.println(d);
    }

}
