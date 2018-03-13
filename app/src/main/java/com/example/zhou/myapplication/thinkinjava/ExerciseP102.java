package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/7.
 */

public class ExerciseP102 {


    public static void main(String[] args) {
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one","two","three");
        printArray(new ExerciseP101(),new ExerciseP102());
        printArray((Object[]) new Integer[]{1,2,3,4});
        printArray();
    }

    private static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();

    }


}
