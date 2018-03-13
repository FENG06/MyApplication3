package com.example.zhou.myapplication.Leetcode;


/**
 * @author Zhou
 * @date 2017/10/23
 */



public class Test1 {


    public static void main(String[] args) {


        int[] a = new int[]{1, 2, 2, 2, 2, 2, 3, 4, 5};
        int value = 2;
        Solution solution = new Solution();
        solution.removeElement(a,a.length,value);
    }


}

class Solution {
    public int removeElement(int [] A, int n, int elem) {
        int i;
        int j = 0;
        for (i = 0; i < n; i++) {
            if (A[i] == elem) {
                continue;
            }
            A[j] = A[i];
            j++;
        }

        return j;
    }
}

class WrongSolution {

    private int arrayLength(int[] array, int compareValue) {

        int i = array.length;
        int Value = compareValue;
        int num = 0;

        for (int j = 0; j < i; j++) {

            if (array[j] > Value) {

                num++;
            }
            System.out.println(num);
        }
        return num;
    }
}