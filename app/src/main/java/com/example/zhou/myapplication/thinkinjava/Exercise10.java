package com.example.zhou.myapplication.thinkinjava;

import static java.lang.System.out;

/**
 * Created by Zhou on 2017/11/2.
 */


public class Exercise10 {

    public static void main(String[] args) {
        int i = 0;
//        outer:
//// can not have statement here
//        for (; true; ) {
//            inner:
//            for (; i < 10; i++) {
//                out.print("i= " + i + " ");
//                if (i == 2) {
//                    out.println("continue");
//                    continue;
//                }
//                if (i == 3) {
//                    out.println("break");
////                    i++;
//                    break outer;
//                }
//                if (i == 7) {
//                    out.println("continue outer");
//                    i++;
//                    continue outer;
//                }
//                if (i == 8) {
//                    out.println("break outer");
//                    break outer;
//                }
//
//                for (int k = 0; k < 5; k++) {
//                    if (k == 3) {
//                        out.println("continue inner");
//                    }
//                }
//
//
//            }
//
//        }


        outer1:
        while (true) {
            out.println("Outer1 while loop");
            while (true) {
                i++;
                out.print("i= " + i +" ");

                if (i == 1) {
                    out.println("continue");
                    continue;
                }

                if (i == 3) {
                    out.println("continue outer1");
                    continue outer1;
                }

                if (i == 5) {
                    out.println("break");
                    break;
                }

                if (i == 7) {
                    out.println("break outer1");
                    break outer1;
                }


            }

        }


    }
}
