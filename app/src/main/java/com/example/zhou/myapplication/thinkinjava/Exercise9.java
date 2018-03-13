package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/2.
 */

public class Exercise9 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }

            System.out.println(i + " ");
        }

        System.out.println("-------------------------- ");

        int i = 0;
        while (true) {

            i++;
            int j = i * 20;
            if (j == 100) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
//            System.out.println(i + " ");

        }

    }


}
