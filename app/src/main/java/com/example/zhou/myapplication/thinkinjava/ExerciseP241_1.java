package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Zhou on 2018/1/2.
 */

public class ExerciseP241_1 implements Iterable<String> {

    protected String[] words = ("All that is how " +
            "we know the Earth to be banana-shaped.").split(" ");

    @NonNull
    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
//                Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }


    public static void main(String[] args) {

        for (String s : new ExerciseP241_1()) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (Map.Entry entry : System.getenv().entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
