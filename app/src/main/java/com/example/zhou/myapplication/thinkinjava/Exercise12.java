package com.example.zhou.myapplication.thinkinjava;

import java.util.Random;

/**
 * Created by Zhou on 2017/11/3.
 */

public class Exercise12 {

    public static void main(String[] args) {

        Random random = new Random(20);
        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(10);
            switch (a) {
                case 1:
                    System.out.println("这是一个随机数" + a);
//                    break;
                case 3:
                    System.out.println("这是一个随机数" + a);
//                    break;
                case 4:
                    System.out.println("这是一个随机数" + a);
//                    break;
                case 6:
                    System.out.println("这是一个随机数" + a);
//                    break;
                case 7:
                    System.out.println("这是一个随机数" + a);
//                    break;
                default:
                    break;
            }
        }
    }

}
