package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * @author Zhou
 * @Date 2018/1/19
 */

public class ExerciseP296 {

    public static String knights = "Then, when you have found the shrubbery,you must" +
            "cut down the mightiest tree in the forest..." + "with .. a herring!";

    public static void spilt(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
//        Doesn't have to contain regex chars
        spilt(" ");
//        Non-word characters
        spilt("\\W+");
//        Word characters
        spilt("\\w+");
//        'n' followed by non-word characters
        spilt("n\\W+");


        System.out.println("----------------------");

        System.out.println(knights.replaceFirst("f\\w+", "located"));
        System.out.println(knights.replaceAll("shrubbery|tree|herring", "banana"));
    }


}
