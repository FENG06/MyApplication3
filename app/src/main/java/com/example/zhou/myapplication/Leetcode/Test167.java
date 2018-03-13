package com.example.zhou.myapplication.Leetcode;

import java.util.Arrays;

/**
 * Created by Zhou on 2017/12/21.
 */

public class Test167 {
    public static void main(String[] args) {
        int nums[] = {-1, 0};
        int target = -1;
        Solution167 s = new Solution167();
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }
}

class Solution167 {
    public int[] twoSum(int[] numbers, int target) {

        int length = numbers.length - 1;


        int[] nums = {0, 0};

        int mid;

        if (length > 2) {

            mid = length / 2;

        } else {
            mid = 1;
        }

        if (numbers[mid] >= target) {

            for (int i = 0; i <= mid; i++) {

                for (int j = i+1; j <= mid; j++) {

                    if (numbers[i] + numbers[j] == 2 * target || numbers[i] + numbers[j] == target) {
                        nums[0] = i + 1;
                        nums[1] = j + 1;
                    }
                }
            }

        } else {
            for (int i = 0; i <= mid; i++) {

                for (int j = length; j > mid; j--) {

                    if (numbers[i] + numbers[j] == 2 * target || numbers[i] + numbers[j] == target) {
                        nums[0] = i + 1;
                        nums[1] = j + 1;

                    }
                }
            }
        }


//         for(int i = 0; i<=length; i++){

//             if(numbers[i]==target){
//                 nums[0]=i+1;
//             } else if(numbers[i]!=target){

//             for(int j = length ; j > 0; j--){

//                 if(numbers[j]==target){

//                     nums[1]=j+1;
//                 }

//                 if(numbers[i]==target-numbers[j]){

//                     nums[0] = i+1;
//                     nums[1] = j+1;

//                 }
//             }
//             }

//         }

        return nums;
    }
}