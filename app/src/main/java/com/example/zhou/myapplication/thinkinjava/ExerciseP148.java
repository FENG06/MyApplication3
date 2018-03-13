package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/10.
 */

public class ExerciseP148 extends Instrument {

    @Override
    public void play(Note n) {

        System.out.println("Wind.play()" + n);

    }
}

enum Note {
    MIDDLE_C, C_SHARO, B_FLAT;
}

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }
}

