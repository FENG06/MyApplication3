package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Zhou
 * @Date 2018/3/26
 */

public class ExerciseP452 implements Comparable<ExerciseP452> {


    int i, j;

    private static int count = 1;


    public ExerciseP452(int n1, int n2) {
        this.i = n1;
        j = n2;
    }

    @Override
    public String toString() {
        String result = "[i=" + i + ", j = " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(@NonNull ExerciseP452 rv) {
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
    }

    private static Random r = new Random(47);

    public static Generator1<ExerciseP452> generator() {
        return new Generator1<ExerciseP452>() {
            @Override
            public ExerciseP452 next() {
                return new ExerciseP452(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        ExerciseP452[] a = Generated.array(new ExerciseP452[12], generator());

        System.out.println("before sorting");

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("After sorting");

        System.out.println(Arrays.toString(a));


    }

}
