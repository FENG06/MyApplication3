package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/7.
 */

public class ExerciseP103 {

    public static void main(String[] args) {
        f('a');
        f('c');
        g(1);
        g();
        System.out.println("int []:" + int[].class);
    }

    private static void g(int... a) {
        System.out.println(a.getClass());
        System.out.println("length" + a.length);

    }

    private static void f(int i,Character... a) {
        System.out.println(a.getClass());
        System.out.println("length" + a.length);
        System.out.println("first");
    }


    private static void f(float i ,Character... a){
        System.out.println("second");
    }


}
