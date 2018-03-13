package com.example.zhou.myapplication.thinkinjava;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by Zhou on 2018/1/17.
 */

public class ExerciseP290_1 {

    private String name;
    private Formatter f;

    public ExerciseP290_1(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {

        f.format("%s The turtle is at (%d,%d)\n", name, x, y);

    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;

        ExerciseP290_1 tommy = new ExerciseP290_1("Tommy", new Formatter(System.out));

        ExerciseP290_1 terry = new ExerciseP290_1("Terry", new Formatter(outAlias));

        tommy.move(0, 0);
        tommy.move(4, 8);
        terry.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }
}
