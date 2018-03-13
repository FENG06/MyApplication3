package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/10.
 */


public class ExerciseP142 {


    private final int i = 0;
    private final int j;
    private final Poppet p;

    public ExerciseP142() {

        j = 1;
        p = new Poppet(1);
    }


    public ExerciseP142(int x) {

        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new ExerciseP142();
        new ExerciseP142(47);
    }


}

class Poppet {
    private int i;

    public Poppet(int i) {
        this.i = i;
    }
}
