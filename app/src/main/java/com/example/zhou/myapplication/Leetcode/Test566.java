package com.example.zhou.myapplication.Leetcode;

import java.util.Arrays;

/**
 * Created by Zhou on 2017/11/15.
 */

public class Test566 {
    public static void main(String[] args) {

        int[][] nums = {{1, 2}, {2, 3}};
        Solution566 solution566 = new Solution566();
        System.out.println(Arrays.deepToString(solution566.matrixReshape(nums, 1, 4)));
        System.out.println(Arrays.deepToString(solution566.matrixReshape1(nums, 4, 1)));
    }
}


class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int originalRow = nums.length;
        int originalcolumn = nums[0].length;

        int num1 = 0;
        int num2 = 0;
        int[][] newnNms = new int[r][c];

        int count = 0;
        int row_count = 0;


        //                    if (num1 < originalRow && num2 < originalcolumn) {
//
//                        if (num1 + num2 == c) {
//                            newnNms[i][j] = nums[num1][num2];
//                        }
//
//                        num1++;
//                        num2++;
//                    }
        if (originalcolumn * originalRow == r * c) {
            target:
            for (int i = 0; i < r; i++) {

                for (int j = 0; j < c; j++) {


                    newnNms[i][j] = nums[num1][num2];

                    count++;

                    if (r > c) {
                        if (count == c) {

                            count = 0;
                            if (num1 < originalRow && num2 < originalcolumn) {
                                num2++;
                                if (num2 == originalcolumn) {
                                    num1++;
                                    num2 = 0;
                                }
                            }
                            continue target;
                        }
                    }
                }


                if (r < c) {
                    if (count == r) {
                        count = 0;
                        if (num1 < originalRow && num2 < originalcolumn) {
                            num1++;
                            if (num1 == originalRow) {
                                num2++;
                                num1 = 0;
                            }
                        }
                    }
                }
            }
        }

        return newnNms;

    }


    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = nums[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return result;
    }
}

