package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Zhou
 * @Date 2018/3/22
 */

public class ExerciseP436_1 {

    private static Random rand = new Random(47);
    static final String[] FLAVORS = {"Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mocha Almond Fudge",
            "Rum Raisin", "Praline Cream", "Mud Pie"};

    public static String[] flavorSet(int n) {

        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("Set too big");
        }

        String[] results = new String[n];

        boolean[] picked = new boolean[FLAVORS.length];

        for (int i = 0; i < n; i++) {

            int t;

            do {
                t = rand.nextInt(FLAVORS.length);
            } while (picked[t]);

            results[i] = FLAVORS[t];
            picked[t] = true;
        }

        return results;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }

        int[][] a = {{1, 2, 3}, {4, 5, 6},};
        System.out.println(Arrays.deepToString(a));


        Random rand = new Random(47);

//        <!--3-D array with varied-length vectors-->

        int[][][] k = new int[rand.nextInt(7)][][];

        for (int i = 0; i < k.length; i++) {
            k[i] = new int[rand.nextInt(5)][];

            for (int j = 0; j < k[i].length; j++) {
                k[i][j] = new int[rand.nextInt(5)];
            }
        }

        System.out.println(Arrays.deepToString(k));


        System.out.println(k.length);
        System.out.println(k[2].length);
        System.out.println(k[1][2].length);
        System.out.println(k[1][2][1]);


    }
}
