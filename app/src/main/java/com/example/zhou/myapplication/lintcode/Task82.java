package com.example.zhou.myapplication.lintcode;

/**
 * Created by Zhou on 2017/11/17.
 */

public class Task82 {

    public static void main(String[] args) {
        Solution82 solution82 = new Solution82();
        int[] A = {1, 2, 2, 1, 3, 4, 3};
        System.out.println(solution82.singleNumber(A));
    }
}

class Solution82 {


    public int singleNumber(int[] A) {

        int length = A.length;

        int target = 0;

        int count = 0;

        int j = 0;
        for (int i = 0; i < length; i++) {

            if (A[i] != A[j]) {
                j++;
            } else {
                target = A[i];
            }
        }
        return target;
    }
}

