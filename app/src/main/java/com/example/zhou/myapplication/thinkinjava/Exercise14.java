package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/3.
 */


public class Exercise14 {


    public static void main(String[] args) {
        Exercise14 exercise14 = new Exercise14();

        for (int i = 1001; i <= 9999; i++) {
            if (exercise14.judgeNum(i, exercise14.divArray(i))) {
                System.out.println(i);
            }
        }

        int num = 1260;
        if (exercise14.judgeNum(num, exercise14.divArray(num))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private boolean judgeNum(int num, int[] a) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                if (i == j) {
                    continue;
                } else {
                    if (6 - i - j == 5) { // i,j=0或1
                        if ((a[i] * 10 + a[j]) * (a[3] * 10 + a[2]) == num || (a[i] + a[j] * 10) * (a[3] * 10 + a[2]) == num) {
                            return true;
                        }
                    } else if (6 - i - j == 4) { // i,j=0或2
                        if ((a[i] * 10 + a[j]) * (a[3] * 10 + a[1]) == num || (a[i] + a[j] * 10) * (a[3] * 10 + a[2]) == num) {
                            return true;

                        } else if (6 - i - j == 3 && (i == 3 || j == 3)) { // i,j=0或3
                            if ((a[i] * 10 + a[j]) * (a[2] * 10 + a[1]) == num || (a[i] + a[j] * 10) * (a[2] * 10 + a[1]) == num) {
                                return true;

                            }
                        } else if (6 - i - j == 3 && (i == 1 || j == 1)) {
                            if ((a[i] * 10 + a[j]) * (a[3] * 10 + a[0]) == num || (a[i] + a[j] * 10) * (a[3] * 10 + a[0]) == num) {
                                return true;

                            } else if (6 - i - j == 2) {
                                if ((a[i] * 10 + a[j]) * (a[2] * 10 + a[0]) == num || (a[i] + a[j] * 10) * (a[2] * 10 + a[0]) == num) {
                                    return true;

                                } else if (6 - i - j == 1) {
                                    if ((a[i] * 10 + a[j]) * (a[1] * 10 + a[0]) == num || (a[i] + a[j] * 10) * (a[1] * 10 + a[0]) == num) {
                                        return true;
                                    }

                                }

                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int[] divArray(int num) {

        int[] a = new int[4];
        int i = 0;
        while (num != 0) {
            a[i++] = num % 10;
            num = num / 10;
        }
        return a;
    }


}
