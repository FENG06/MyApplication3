package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/31
 */

public class ExerciseP355_1<A, B, C, D> extends ExerciseP355<A, B, C> {

    public final D fourth;

    public ExerciseP355_1(A a, B b, C c, D fourth) {
        super(a, b, c);
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + ","+fourth+")";
    }

}
