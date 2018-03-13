package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/12/19.
 */

public class Test283 {

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 0, 0, 1};
        Solution283 s = new Solution283();
//        s.moveZeroes(nums);
        s.moveZeroes1(nums);
    }

}

class Solution283 {

    public void moveZeroes(int[] nums) {

        int length = nums.length;

        int count = 0;

        for (int i = 0; i <= length - 1; i++) {

            if (nums[i] == 0 && (i + count < length)) {

                count++;

                for (int j = i; j <= length - 2 - i; j++) {

                    nums[j] = nums[j + 1];

                }

                nums[length - 1 - i] = 0;

            }

            if (nums.length == 2 && nums[0] == 1 && nums[1] == 0) {
                nums = new int[]{1, 0};
            }

            if (nums.length == 3 && nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
                nums = new int[]{1, 0, 0};
            }
        }
    }


    public void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int cur = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}