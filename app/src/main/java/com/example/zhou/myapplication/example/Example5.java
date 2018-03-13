package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/9/14.
 */

public class Example5 {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4, 8, 9}, {4, 5, 6}, {7, 8, 9}};
        int target = 9;
        Solution solution = new Solution();
        solution.Find(array, target);
    }
}

class Solution {

    public boolean Find(int[][] array, int target) {
        int row = 0;
        int col = array[0].length - 1;
        while (row <= array.length - 1 && col >= 0) {
            if (target == array[row][col]) {
                System.out.print("找到匹配的数字" + "在第" + row + "行" + "在第" + col + "列");
                return true;
            } else if (target > array[row][col])
                row++;
            else
                col--;
        }
        return false;
    }

}
