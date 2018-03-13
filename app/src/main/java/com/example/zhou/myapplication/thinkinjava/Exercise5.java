package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/2.
 */

public class Exercise5 {

    public static void main(String[] args) {
        int num = 11;
//        judge(num);
        Exercise5 exercise5 = new Exercise5();
        exercise5.judge1(num);
    }


    private boolean judge1(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + "不是素数");
                return true;
            }
        }

        System.out.println(num + "是素数");
        return false;

    }

//    private static void judge(int num) {
//
//        if (num % 2 == 1) {
//            for (int i = 0; i < num; i++) {
//                for (int j = 0; j < num; j++) {
//                    while (i * j != num) {
////                        System.out.println("这是个素数");
//                    }
//
//                }
//            }
//        }
//        else {
//            System.out.println("这不是个素数");
//        }
//    }
}
