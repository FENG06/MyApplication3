package com.example.zhou.myapplication.algorithms;

/**
 * Created by Zhou on 2017/12/11.
 */

public class LogCalculate {

    public static void main(String[] args) {

        System.out.println(Calculate.cLog(1));
        System.out.println(Calculate.ln(10));

    }

}

class Calculate {

//    static double calculateinput(double i) {
//
//        int sum = 0;
//
//        if (i > 0) {
//
//
//            i = i - 1;
//
//        }
//
//        return sum + Math.log10(calculateinput(i));
//
//
//    }

    public static double cLog(int n) {
        if (n == 1 || n == 0) {
            return 0;
        } else {
            return Math.log(n) + cLog(n - 1);
        }
    }


    static double ln(int N) {
        int sum = 1;
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        for (int i = 2; i <= N; i++) {
            sum *= i;
        }
        return Math.log10(sum);

    }
}