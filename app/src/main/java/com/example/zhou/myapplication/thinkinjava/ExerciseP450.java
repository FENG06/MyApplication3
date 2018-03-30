package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * @author Zhou
 * @Date 2018/3/23
 */

public class ExerciseP450 {

    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(j, 99);
        System.out.println("i= " + Arrays.toString(i));
        System.out.println("j= " + Arrays.toString(j));

        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("j= " + Arrays.toString(j));

        System.arraycopy(i, 0, j, 1, i.length);
        System.out.println("j= " + Arrays.toString(j));
    }
}
