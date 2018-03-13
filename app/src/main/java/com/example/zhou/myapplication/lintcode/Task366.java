package com.example.zhou.myapplication.lintcode;

/**
 * Created by Zhou on 2017/11/16.
 */

public class Task366 {
    public static int fibonacci(int n) {
        // write your code here
        int[] array = new int[n];


        if (n == 1) {
            return 0;
        }


        if (n == 2) {
            return 1;
        }


        if (n > 2) {

            array[0] = 0;
            array[1] = 1;

            for (int i = 2; i < n; i++) {

                array[i] = array[i - 1] + array[i - 2];

            }
        }

        return array[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(100));
    }


}
