package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class ExerciseP97 {

    int [] a;

    static String s1 = "定义处初始化";

    static String s2;

    static {
        s2 = "静态代码块初始化";
    }

    public static void main(String[] args) {

    print();
    }

    static void print() {
        System.out.println("str1="+s1+"  str2="+s2);
    }
}
