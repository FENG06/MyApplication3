package com.example.zhou.myapplication.algorithms;

/**
 * Created by Zhou on 2017/12/7.
 */

public class BinarySerach {

    int a;

    public static int rank(int key, int[] a) {

        int d;
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static void judge(int a, int b, int c) {

        if (a == b && b == c) {

            System.out.println("equal");
        } else {
            System.out.println("not equal");

        }

    }

    public static void main(String[] args) {

        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('b' + 4));
        System.out.println(1 + 2 + "k" + 1 + 2 + "k");

    }
}
