package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP358_1 {

    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Latte extends ExerciseP358_1 {
}

class Mocha extends ExerciseP358_1 {
}

class Cappuccino extends ExerciseP358_1 {
}

class Americano extends ExerciseP358_1 {
}

class Breve extends ExerciseP358_1 {
}