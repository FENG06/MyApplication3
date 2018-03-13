package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/17.
 */

public class ExerciseP176 {

}


class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform" + id;
    }
}

class Filter {
    public String getName() {
        return getClass().getSimpleName();
    }

    public Waveform processor(Waveform input) {
        return input;
    }

    public String name() {
        return getClass().getSimpleName();
    }
}

class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform processor(Waveform input) {

        //Dummy Processing
        return input;
    }
}


