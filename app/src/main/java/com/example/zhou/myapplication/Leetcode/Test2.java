package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/10/29.
 */

public class Test2 {



    public static void main(String[] args) {
        int a[] = new int[]{1,1,1,1,2,2,3};
        int n= a.length;

    String s= new String("mojap");
        Solution2 solution2 = new Solution2();
        solution2.removeDuplicates(a,n);



    }
}

class Solution2 {
    public int removeDuplicates(int A[], int n) {

        if (n == 0) {
            return 0;
        }


        int j = 0;
        int num = 0;

        for (int i = 1; i < n; i++) {

            if (A[j] == A[i]) {

                num++;

                if (num < 2) {
                    A[++j] = A[i];
                } else {
                    A[++j] =A[i];
                    num = 0;
                }



            }

        }

        return j + 1;
    }
}
