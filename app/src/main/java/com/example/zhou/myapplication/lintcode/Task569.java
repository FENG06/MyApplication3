package com.example.zhou.myapplication.lintcode;

/**
 * Created by Zhou on 2017/11/22.
 */

public class Task569 {

    public static void main(String[] args) {
        System.out.println(Solution569.addDigits(1));
    }
}

class Solution569 {
    public static int addDigits(int num) {
        // write your code here

        int count;
        int sum = 0;

        if (num < 10) {
            return num;
        }

        for (int num1 = num; num1 > 0; num1 /= 10) {

            count = num1 % 10;
            sum += count;
        }


//         (num >= 10) {
//
//            count = num % 10;
//            num = num / 10;
//            sum += count;
//            if (num / 10 != 0) {
//
//
//            }
//
//        }


        return addDigits(sum);
    }
}
