package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/8.
 */

public class ExerciseP258 {

    static void f() {
        // TODO: 2018/1/8 Generate an Exception to fill in the stack trace
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }

    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("----------------------------");
        g();
        System.out.println("----------------------------");
        h();
    }

}
