package com.example.zhou.myapplication.Leetcode;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by Zhou on 2017/11/22.
 */

public class Sample1 {

    public static void main(String[] args) {

        int num[] = {1, 3, 2, 8, 4, 5, 6};
        int targte = 4;
        out.println(Arrays.toString(SolutionSample1.twoSum(num, targte)));

        String a = "2003-10-12";
        String b = "2003-10-21";

        SolutionSample1.compareData(a, b);
    }


}

class SolutionSample1 {


    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length; j++) {

                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }

        }
        throw new IllegalArgumentException("No two sum solution");

    }


    public static void compareData(String s1, String s2) {
        int result = s1.compareTo(s2);
        if (result == 0) {
            out.println("a=b");
        } else if (result < 0) {
            out.println("a<b");
        } else {
            out.print("a>b");
        }


    }


}