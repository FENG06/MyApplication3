package com.example.zhou.myapplication.thinkinjava;

import java.util.Random;

/**
 * Created by Zhou on 2017/11/3.
 */

public class Exercise11 {

    public static void main(String[] args) {
        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = random.nextInt(26) + 'a';
            System.out.println((char) c + "," + c + ":");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;

                case 'y':
                case 'w':
                    System.out.println("Sometimes a vowel");
                    break;
                default:
                    System.out.println("constant");

            }

        }
    }


}
