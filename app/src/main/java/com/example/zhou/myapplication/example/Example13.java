package com.example.zhou.myapplication.example;

import java.util.Scanner;

/**
 * Created by Zhou on 2017/9/26.
 */

public class Example13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int coinCount = in.nextInt();
            StringBuilder stringBuilder = new StringBuilder();
            while (coinCount > 0) {
                if (coinCount % 2 == 0) {
                    //偶数
                    coinCount = (coinCount - 2) / 2;
                    stringBuilder.append("2");
                } else {
                    //奇数
                    coinCount = (coinCount - 1) / 2;
                    stringBuilder.append("1");

                }
            }
            System.out.println(stringBuilder.reverse().toString());
        }
    }


}

