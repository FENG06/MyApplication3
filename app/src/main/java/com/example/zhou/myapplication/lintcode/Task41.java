package com.example.zhou.myapplication.lintcode;

import java.util.Vector;

/**
 * Created by Zhou on 2017/11/23.
 */

public class Task41 {

    public static void main(String[] args) {
        int[] nums = {-2, 2, -3, 4, -1, 2, 1, -5, 3};
        int[] nums2 = {1, -2, 3};

        System.out.println(Solution41.sum3(nums));
        System.out.println(Solution41.MaxSubArray(nums));
        System.out.println(Solution41.MaxSubArray(nums2));

        //        System.out.println(Solution41.maxSubArray(nums));
    }

}

class Solution41 {

    public static int maxSubArray(int[] nums) {


//        int[] a = new int[0];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] < nums[j]) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }


            }
        }


        int subsum = 0;
        for (int m = 0; m < nums.length; m++) {

            if (nums[m] > 0) {

                sum += nums[m];
                count++;

            }

            subsum = sum + nums[8];


        }


        return subsum;

//            if (nums[i] > 0) {
//
//                count++;
//
//            }

//
//        for (int j = 0; j < count; j++) {
//
//
//            sum += a[j];
//        }


    }


    public static int sum2(Vector<Integer> nums) {


        int ans = 0;
        int n = nums.size();
        //因为求最大值，所以给结果初始化一个很小的数
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums.get(k);
                }
                if (sum > ans) {
                    ans = sum;
                }
            }
        }
        return ans;
    }


    static int sum3(int[] nums) {
        int res = Integer.MIN_VALUE;
        int curSum = 0;
        for (int num : nums) {
            curSum = Math.max(curSum + num, num);
            res = Math.max(res, curSum);
        }
        return res;
    }

    static int MaxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        int w = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                for (int k = i; k <= j; k++) {

                    currSum += nums[k];
                    w++;
                }

                if (currSum > maxSum) {

                    maxSum = currSum;
                }

                currSum = 0;
            }
        }

        System.out.println("运行次数" + w);

        return maxSum;

    }

}