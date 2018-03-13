package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhou on 2018/1/15.
 */

public class ExerciseP287 {

    @Override
    public String toString() {

//        这里发生了自动类型转换，由ExerciseP287转换为String类型，编译器试着将this转换成一个String。而转换过程是
//        通过调用this()上的toString()方法，于是就发生递归调用。
//            正确的方式是调用super.toString()方法
        return "ExerciseP287{}" + super.toString();
    }

    public static void main(String[] args) {

        List<ExerciseP287> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new ExerciseP287());
        }
        System.out.println(v);


        int x = 10;
        float y = 11;

        System.out.printf("Row 1:[%d %f]\n", x, y);


    }

}
