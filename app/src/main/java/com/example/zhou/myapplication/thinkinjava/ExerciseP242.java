package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * Created by Zhou on 2018/1/2.
 */

public class ExerciseP242 {

    static <T> void test(Iterable<T> ib) {

        for (T t : ib) {
            System.out.println(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
//        An array works in foreach,but it's not Iterable
//        test(strings);

//        You must explicitly covert it to an Iterable
        test(Arrays.asList(strings));
    }


}
