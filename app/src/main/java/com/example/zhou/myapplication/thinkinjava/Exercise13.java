package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * Created by Zhou on 2017/11/3.
 */

public class Exercise13 {

    public static void main(String[] args) {
        fibonacci(5);
    }

    private static void fibonacci(int target) {

        int a[] = new int[7];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {


            a[i] = a[i - 1] + a[i - 2];

        }

        for (int j = 0; j < a.length; j++) {

            if (a[j] == target) {

                for (int n = 0; n <= j; n++) {
                    System.out.println(a[n]);
                }

//                    for (int k = 0; k < j ; k++) {
//                        a[k] =a[j]
            }
        }


    }


}


