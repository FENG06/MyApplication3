package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/7.
 */

public class ExerciseP101_1 {

    public static void main(String[] args) {
        Other.main(new String[]{"fiddle", "de", "dum"});
    }

}

class Other {

    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s + " ");
        }
    }
}