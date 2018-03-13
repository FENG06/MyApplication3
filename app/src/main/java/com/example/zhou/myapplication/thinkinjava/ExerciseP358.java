package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP358<T> {

    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        ExerciseP358<String> rs = new ExerciseP358<>();
        for (String s : ("The quick brown fox jumped over " + "the lazy brown dog").split(" ")) {
            rs.add(s);
        }

        for (int i = 0; i < 11; i++) {
            System.out.print(rs.select() + " ");
        }
    }

}
