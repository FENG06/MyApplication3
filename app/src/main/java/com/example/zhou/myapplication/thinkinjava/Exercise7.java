package com.example.zhou.myapplication.thinkinjava;

import java.util.Random;

/**
 * Created by Zhou on 2017/11/2.
 */

public class Exercise7 {

    public static void main(String[] args) {

        Random random = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < f.length; i++) {
            f[i] = random.nextFloat();
            System.out.println(f[i]);
        }

        System.out.println("-------------");

        for (float x : f
                ) {
            System.out.println(x);
        }

        for (char c: "An African Swallow".toCharArray()
             ) {
            System.out.printf(String.valueOf(c));

        }


    }
}
