package com.example.zhou.myapplication.lintcode;

/**
 * Created by Zhou on 2017/12/4.
 */

public class Task14 {
    public static void main(String[] args) {
        int array[] = {3, 4, 5, 8, 10, 13, 14};
        int array1[] = {1, 2, 3, 4, 5};

        Solution14 solution14 = new Solution14();
//        System.out.println(Solution14.binartSearch1(array1, 8));
        System.out.println(Solution14.binarySearch2(array1, 3));

    }
}


class Solution14 {


    public int binarySearch(int[] nums, int target) {

        int length = nums.length;


        if (length % 2 == 0) {

            if (nums[length / 2 - 1] > target)

            {
                for (int i = 0; i < length; i++) {

                }
            }

        }

        return -1;
    }


    public static int binartSearch1(int nums[], int target) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int middle = left + ((right - left)) >> 1;

            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }

        }

        return -1;
    }


    public static int binarySearch2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                right = mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }
}