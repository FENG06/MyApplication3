package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/12/19.
 */

public class Test485 {

    public static void main(String[] args) {
        int[] a = {0, 1};
        System.out.println(Solution485.findMaxConsecutiveOnes(a));
    }
}

class Solution485 {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int length = nums.length;
        int count = 0;
        int max = nums[0];

        for (int i = 0; i <= length - 1; i++) {

            if (nums[i] == 1) {

                count++;

                nums[i] = count;

            } else if (nums[i] == 0) {
                count = 0;
                continue;
            }
        }


//        for (int j = 0; j <= length - 1; j++) {
//
//            for (int k = 1; k <= length - 1; k++) {
//
//                if (nums[j] <= nums[k]) {
//
//                    int temp = nums[k];
//                    nums[j] = temp;
//                    nums[k] = nums[j];
//                }
//
//
//            }
//
//        }

        for (int j = 0; j < length - 1; j++) {

            if (nums[j] > max) {
                max = nums[j];
            }

        }

        return max;
    }
}
