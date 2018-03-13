package com.example.zhou.myapplication.msra;

/**
 * Created by Zhou on 2017/11/3.
 */

public class Exercise1 {

    public static void main(String[] args) {

        int[] array = new int[]{2, 4, 6, 8, 4, 5};
        DivArray1(array);
        DivArray(array);
    }


    private static void DivArray(int[] pArray) {
        for (int i = pArray.length - 1; i >= 0; i--) {

            pArray[i] /= pArray[0];

        }

    }

    private static void DivArray1(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] /= array[0];

        }


    }


}
