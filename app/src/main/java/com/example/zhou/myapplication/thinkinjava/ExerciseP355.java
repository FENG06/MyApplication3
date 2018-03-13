package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/31
 */

public class ExerciseP355<A, B, C> extends ExerciseP354_1<A, B> {

    public final C third;

    public ExerciseP355(A a, B b, C c) {
        super(a, b);
        this.third = c;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }
}
