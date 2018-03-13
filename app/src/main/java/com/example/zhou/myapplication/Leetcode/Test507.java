package com.example.zhou.myapplication.Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhou on 2017/12/29.
 */

public class Test507 {

    public static void main(String[] args) {
        int num = 28;

        Solution507 s = new Solution507();

        System.out.println(s.checkPerfectNumber1(num));
        System.out.println(s.checkPerfectNumber(num));


    }

}

class Solution507 {
    public boolean checkPerfectNumber(int num) {

        List<Integer> divisorslist = new ArrayList<>();

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {

                divisorslist.add(i);
            }
        }


        int size = divisorslist.size();
        int sum = 0;
        for (int j = 0; j < size; j++) {
            sum += divisorslist.get(j);
        }

        return sum == num;

    }


    public boolean checkPerfectNumber1(int num) {

        int sum = 1;

        for (int i = 2; i * i < num; i++) {

            if (num % i == 0) {
                sum  += i + num / i;
            }

            if (i * i == num) {
                sum -= i;
            }

            if (sum > num) {

                return false;
            }
        }
        return sum == num;
    }
}