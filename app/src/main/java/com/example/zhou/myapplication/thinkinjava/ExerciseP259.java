package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/9.
 */

public class ExerciseP259 {

    public static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main");
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("main");
            e.printStackTrace(System.out);
        }

    }

}
