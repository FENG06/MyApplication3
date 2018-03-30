package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Zhou
 * @Date 2018/3/26
 */

public class ExerciseP453 {
    public static void main(String[] args) {
        ExerciseP452[] a = Generated.array(new ExerciseP452[12], ExerciseP452.generator());
        System.out.println("before sorting");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.<ExerciseP452>reverseOrder());
        System.out.println("After sorting");
        System.out.println(Arrays.toString(a));


    }


}
