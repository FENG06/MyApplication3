package com.example.zhou.myapplication.lintcode;

/**
 * Created by Zhou on 2017/11/19.
 */

public class Task1 {


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        System.out.println(solution1.aplusb(13, 9));
    }
}


class Solution1 {

    public int aplusb(int a, int b) {

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        int x = a ^ b;
        int y = (a & b) << 1;

        return aplusb(x, y);


    }

}
