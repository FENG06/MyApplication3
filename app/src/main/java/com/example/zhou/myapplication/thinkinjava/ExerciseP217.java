package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;

/**
 * Created by Zhou on 2017/12/15.
 */

public class ExerciseP217 {

    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {

            apples.add(new Apple217());
            apples.add(new Orange());

            for (int j = 0; j < apples.size(); j++) {

                ((Apple217) apples.get(i)).id();


            }
        }
    }

}


class Apple217 {

    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {

}
