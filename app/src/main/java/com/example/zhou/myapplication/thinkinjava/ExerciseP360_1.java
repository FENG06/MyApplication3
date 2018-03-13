package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;

import java.util.Iterator;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP360_1 extends ExerciseP360 implements Iterable<Integer> {

    private int n;

    public ExerciseP360_1(int count) {
        this.n = count;
    }

    @NonNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return ExerciseP360_1.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new ExerciseP360_1(18)) {
            System.out.println(i + " ");
        }
    }
}
