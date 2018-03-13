package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/19
 */

public class ExerciseP298 {


    public static void main(String[] args) {

        for (String pattern : new String[]{"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"}) {

            System.out.println("Rudolph".matches(pattern));

        }


    }

}
