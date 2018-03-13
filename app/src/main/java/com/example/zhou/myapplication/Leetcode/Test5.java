package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/11/7.
 */

public class Test5 {

    public static void main(String[] args) {

        int x = 10, y = 11;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        Solution1 solution1 = new Solution1();
        solution1.hammingDistance(x, y);

    }

}

class Solution1 {
    public int hammingDistance(int x, int y) {

        int z = x ^ y;
        int num = 0;
        while (z != 0) {
            if (z % 2 == 1) {
                num++;
            }
            z >>>= 1;
        }
        System.out.println(num);
        return num;
    }
}