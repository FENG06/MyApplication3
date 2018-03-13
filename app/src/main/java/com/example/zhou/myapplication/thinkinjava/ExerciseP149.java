package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/10.
 */

class Music{

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {

        ExerciseP148 flute = new ExerciseP148();
        tune(flute);


    }
}


