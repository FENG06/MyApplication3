package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zhou on 2017/11/7.
 */

public class ExerciseP100_1 {

    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {

            a[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(a));

    }


}
