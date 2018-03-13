package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/11/12.
 */

public class Test344 {

    public static void main(String[] args) {

        System.out.println(Soulution344.reverseString("hello"));
    }

}

class Soulution344 {
    public static String reverseString(String s) {
        char[] a = s.toCharArray();

        System.out.println(a);

        char [] b = new char[a.length];
        int num =0;

        for (int i = a.length - 1; i >= 0; i--) {

            b[num++]=a[i];
        }

        return String.valueOf(b);

//            System.out.println(a[i]);

//        for (char c : a) {
//
//            System.out.println(c);
//
//        }


//        for (int j = 0, i = s.length() - 1; j < s.length(); j++) {
//
//            if (i >= 0) {
//
//                a[j] = s.charAt(i);
//                i--;
//            }
//
//        }


    }

}
