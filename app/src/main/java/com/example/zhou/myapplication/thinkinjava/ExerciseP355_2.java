package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/31
 */

public class ExerciseP355_2<A, B, C, D, E> extends ExerciseP355_1<A, B, C, D> {

    public final E fifth;

    public ExerciseP355_2(A a, B b, C c, D fourth, E e) {
        super(a, b, c, fourth);
        this.fifth = e;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + "," + fourth + "," + fifth + ")";
    }
}
