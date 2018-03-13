package com.example.zhou.myapplication.thinkinjava;

import static java.lang.System.out;

/**
 * Created by Zhou on 2017/11/2.
 */

public class Exercise8 {
    public static void main(String[] args) {
        test(1,3,4);
    }

    private static int test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end) {
            out.println(testval + "这个数在" + begin + "和" + end + "之间");

            return 1;
        } else {
            out.println(testval + "这个数不在" + begin + "和" + end + "之间");
            return -1;

        }
    }

}
