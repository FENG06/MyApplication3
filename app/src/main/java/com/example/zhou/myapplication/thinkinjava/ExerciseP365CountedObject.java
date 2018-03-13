package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP365CountedObject {

    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
