package com.example.zhou.myapplication.codility;

import java.util.Arrays;

/**
 * Created by Zhou on 2017/11/16.
 */

public class Task1 {


    public static void main(String[] args) {

        int[] a = {1};
        int N = 6;
//        System.out.println(Arrays.toString(Solution.solution(a, 6)));

        System.out.println(Solution.solution(a, N));
    }
}

class Solution {

    static int solution(int[] A, int N) {

//        int temp[] = new int[1];
        int temp;
        int result = 0;

        for (int i = 0; i <A.length; i++) {

            for (int j = 0; j <A.length-1; j++) {

                if (A[j] > A[j + 1]) {

                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }


        for (int l = 0; l <A.length; l++) {

            for (int m = 1; m <A.length; m++) {

                if (A[l] - A[m] > 1) {

                    result = A[l] + 1;
                }
            }
        }

        for (int n = 0; n <A.length; n++) {
            if (A[n] < 0) {
                result = 1;
            }
        }

        return result;
    }

}