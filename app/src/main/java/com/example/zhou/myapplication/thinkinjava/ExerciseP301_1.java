package com.example.zhou.myapplication.thinkinjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Zhou
 * @Date 2018/1/19
 */

public class ExerciseP301_1 {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();

        int i = 0;
        while (m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }

    }

}
