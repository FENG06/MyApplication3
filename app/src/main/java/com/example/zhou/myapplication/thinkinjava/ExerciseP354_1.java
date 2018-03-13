package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/31
 */

public class ExerciseP354_1<A, B> {

    public final A first;
    public final B second;

    public ExerciseP354_1(A a, B b) {
        first = a;
        second = b;
    }

    @Override
    public String toString() {
        return "(" + first +
                ", " + second +
                ")";
    }
}
