package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;

import java.util.Iterator;

/**
 * Created by Zhou on 2018/1/3.
 */

public class ExerciseP244 extends ExerciseP241_1 {


    public Iterable<String> reversed() {

        return new Iterable<String>() {
            @NonNull
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {

                    int current = words.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }


}
