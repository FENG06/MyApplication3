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
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        int c = Integer.parseInt(args[2]);
//        judge(a, b, c);


        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char) ('b' + 4));
        System.out.println(1 + 2 + "k" + 1 + 2 + "k");


//        int[] list = {1, 2, 3, 4, 5, 6};
//        int target = 3;
//        System.out.println(rank(target, list));
//
//
//        int a = 14;
//        int b = 3;
//        int c = -14;
//        int d = -3;
//        double e = 14.1;
//
//
//        System.out.println((1 + 2.236) / 2);
//
//        System.out.println(1 + 2 + 3 + 4.0);
//
//        System.out.println(4.1 >= 4);
//
//        System.out.println(1 + 2 + "3");


//
//        int[] whitelist = In.readInts(args[0]);
//        Arrays.sort(whitelist);
//        while (!StdIn.isEmpty()) {
//            int key = StdIn.readInt();
//            if (rank(key, whitelist) < 0) {
//                StdOut.println(key);
//            }
//        }

//
//        int N = 100;
//        StdDraw.setXscale(0, N);
//        StdDraw.setYscale(0, N * N);
//        StdDraw.setPenRadius(.01);
//
//        for (int i = 0; i <= N; i++) {
//            StdDraw.point(i, i);
//            StdDraw.point(i, i * i);
//            StdDraw.point(i, i * Math.log(i));
//
//        }


    }


}
