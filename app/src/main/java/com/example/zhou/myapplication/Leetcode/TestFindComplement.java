package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/11/9.
 */

public class TestFindComplement {


    public static int findComplement(int num) {

//        int a = ~num;

//        System.out.println(a);

//        return a;


        int[] c = new int[3];

        for (int i = 0; i < 3; i++) {

            while (num != 0) {

                c[i] = ~(num % 2);

                num = num - c[i];
            }

        }

        return num;
    }

    public static int findComplement1(int num) {


        int num1 = highest(num);
        int num2 = num1 << 1;
        int num3 = num2 - 1;
        int num4 = ~num;
        System.out.println(num4);
        int num5 = num3 & num4;

        return num5;

    }


    public static int highest(int i) {
        i |= (i >> 1);
        i |= (i >> 2);
        i |= (i >> 4);
        i |= (i >> 8);
        i |= (i >> 16);
        return i - (i >>> 1);
    }

    public static void main(String[] args) {

        System.out.println(findComplement1(0));
        System.out.println(highest(7));

    }


}


