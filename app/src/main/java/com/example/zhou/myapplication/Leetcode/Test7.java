package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/11/9.
 */

public class Test7 {

    public boolean Find(int target, int[][] array) {

        int c_length = array[0].length;
        int r_length = array[1].length;

        int n = 0;
        for (int i = 0; i < c_length; i++) {
            for (int j = 0; j < r_length; j++) {

                if (array[n][r_length] > target) {
                    array[n][r_length] = array[n][r_length - 1];
                } else if (array[n][r_length] < target) {
                    array[n][r_length] = array[n + 1][r_length];
                } else if (array[n][r_length] == target) {
                    System.out.println("找到target");
                    return true;
                }


            }

        }

        return false;
    }


}
