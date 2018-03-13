package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP320 {

    public static void main(String[] args) {
        Class inclass = int.class;
        Class<Integer> genericIntClass = int.class;
//        same thing
        genericIntClass = Integer.class;
        inclass = double.class;
        genericIntClass = inclass;
//        genericIntClass = double.class;


        Class<?> intClass = int.class;
        inclass = double.class;
        inclass = char.class;

        Class<Integer> geclass = Integer.class;

    }
}
