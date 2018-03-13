package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * Created by Zhou on 2017/11/7.
 */

public class ExerciseP101 {

    public static void main(String[] args) {

        Integer[] a = {
                Integer.valueOf(1), Integer.valueOf(2), 3
        };
        Integer[] b = new Integer[]{
                new Integer(1), new Integer(2), 3
        };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }


}
