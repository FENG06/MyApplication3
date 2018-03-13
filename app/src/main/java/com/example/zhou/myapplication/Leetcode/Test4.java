package com.example.zhou.myapplication.Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Zhou on 2017/11/2.
 */

public class Test4 {

    public static void main(String[] args) {

        int [] nums = new int[]{1,2,3,4};
        arrayPairSum(nums);
    }

    private static int arrayPairSum(int nums[]) {

        Arrays.sort(nums);

        int result = 0;

        for (int i = 0; i < nums.length; i += 2) {

            result += nums[i];
        }

        return result;

    }

}
