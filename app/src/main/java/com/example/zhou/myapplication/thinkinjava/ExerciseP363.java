package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP363 {

    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHIGKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }


}
