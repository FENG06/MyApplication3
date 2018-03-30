package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * @author Zhou
 * @Date 2018/3/22
 */

public class ExerciseP439 {

    public static void main(String[] args) {
        Integer[][] a;
        a = new Integer[3][];

        for (int i = 0; i < a.length; i++) {

            a[i] = new Integer[3];

            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = i * j;
                //Autoboxing
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
