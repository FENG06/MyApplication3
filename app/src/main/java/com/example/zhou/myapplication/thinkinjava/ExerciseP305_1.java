package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author Zhou
 * @Date 2018/1/22
 */

public class ExerciseP305_1 {

    public static void main(String[] args) {
        String input = "This!!unusual use!! of exclamation!! points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
//        Only do the first three
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 4)));

    }

}
