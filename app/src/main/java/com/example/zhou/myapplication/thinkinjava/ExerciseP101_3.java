package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/7.
 */

public class ExerciseP101_3 {


    public ExerciseP101_3(String s) {

        System.out.println(s);
    }

    public static void main(String[] args) {

        ExerciseP101_3[] exerciseP1013s = new ExerciseP101_3[2];

        for (int i = 1; i < 3; i++) {
            exerciseP1013s[i-1]=new ExerciseP101_3(""+i);
        }


//        ExerciseP1013 exerciseP1013 = new ExerciseP1013("测试");
    }


}
