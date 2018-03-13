package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author Zhou
 * @date 2018/1/3
 */

public class ExerciseP244_1 extends ExerciseP241_1 {


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


    public Iterable<String> randomized() {


        return new Iterable<String>() {

            @NonNull
            @Override
            public Iterator<String> iterator() {

                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }


    public static void main(String[] args) {
        ExerciseP244_1 mic = new ExerciseP244_1();

        for (String s : mic.reversed()) {
            System.out.print((s + " "));
        }
        System.out.println();

        for (String s : mic.randomized()) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : mic) {
            System.out.print(s + " ");
        }
    }


}
