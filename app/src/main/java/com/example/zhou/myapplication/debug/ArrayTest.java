package com.example.zhou.myapplication.debug;

/**
 * Created by Zhou on 2017/11/9.
 */

public class ArrayTest {

    public static boolean Find(int target, int[][] array) {

        int column = array.length;
        //行
        int row = array[1].length;
        //列

        int i, j;

        for (i = column - 1, j = 0; i >= 0 && j < row; ) {

            if (target == array[i][j]) {
                return true;
            }
            if (target < array[i][j]) {
                i--;
                continue;
            }
            if (target > array[i][j]) {
                j++;
                continue;
            }
        }

        return false;
//
//        if (target == array[0][])
//
//        for (int i = 0; i < c_length; i++) {
//            for (int j = 0; j < r_length; j++) {
//
//                if (array[n][r_length] > target) {
//                    array[n][r_length] = array[n][r_length - 1];
//                } else if (array[n][r_length] < target) {
//                    array[n][r_length] = array[n + 1][r_length];
//                } else if (array[n][r_length] == target) {
//                    System.out.println("找到target");
//                    return true;
//                }
//
//
//            }
//
//        }
//
//        return false;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{2, 1, 4}, {3, 5, 6}, {4, 7, 8}, {5, 9, 10}};

        int target = 4;
        Find(target, array);


    }

}
