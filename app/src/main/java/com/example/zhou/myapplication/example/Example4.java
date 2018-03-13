package com.example.zhou.myapplication.example;


/**
 * Created by Zhou on 2017/9/13.
 */

public class Example4 {


    public static void main(String[] args) {
        int[] arr = new int[]{25, 24, 12, 76, 101, 96, 28};

        int b;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            System.out.println(arr[i]);




        }

        Outer outer = new Outer();
        outer.test();
    }
}