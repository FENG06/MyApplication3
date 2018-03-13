package com.example.zhou.myapplication.Leetcode;

import java.util.Arrays;

/**
 * Created by Zhou on 2018/1/11.
 */

public class Test136 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Solution136.singleNumber(nums));
    }
}

class Solution136 {

    public static int singleNumber(int[] nums) {

        int length = nums.length - 1;
        int target = 0;

        if (length == 1) {
            return nums[0];
        } else {

            Arrays.sort(nums);

            if (nums[0] != nums[1]) {
                target = nums[0];
            } else if (nums[length - 1] != nums[length]) {
                target = nums[length];
            } else {
                for (int i = 1; i < length; i++) {
                    if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                        target = nums[i];
                    }
                }
            }
        }
        return target;
    }
}