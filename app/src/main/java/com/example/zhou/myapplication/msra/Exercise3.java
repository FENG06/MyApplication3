package com.example.zhou.myapplication.msra;

/**
 * @author Zhou
 * @Date 2018/3/5
 */

public class Exercise3 {

    public static void main(String[] args) {

        int[] person1 = {0, 2, 3, 4};

        Solution s = new Solution();
        System.out.println(s.solution(person1));
    }
}

class Solution {

    //    nPerson[i] 表示到第i层的乘客数目

    int nFloor, nMinFloor;
    int nTargetFloor = -1;

    int solution(int[] nPerson) {

        for (int i = 1; i <= nPerson.length - 1; i++) {

            nFloor = 0;

            for (int j = 1; j < i; j++) {

                nFloor += nPerson[j] * (i - j);
            }

            for (int j = i + 1; j <= nPerson.length - 1; j++) {

                nFloor += nPerson[j] * (j - i);
            }


            if (nTargetFloor == -1 || nMinFloor > nFloor) {
                nMinFloor = nFloor;
                nTargetFloor = i;
            }
        }

        return nTargetFloor;
    }
}
