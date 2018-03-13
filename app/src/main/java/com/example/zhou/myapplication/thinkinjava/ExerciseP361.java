package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP361 {

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <A, B, C> void g(A a, B b, C c) {

    }

    public static void main(String[] args) {
        ExerciseP361 gm = new ExerciseP361();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
