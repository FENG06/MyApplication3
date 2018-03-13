package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * Created by Zhou on 2017/11/17.
 */

public class ExerciseP175 {

    public static void process(Processor p, Object s) {

        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }


    public static String s = "Disagreement with beliefs is by definition incorrect";


    public static void main(String[] args) {

        Waveform waveform = new Waveform();




//        process(new Upcase(), s);
//        process(new Downcase(), s);
//        process(new Spiltter(), s);
//




    }

}


class Processor {
    public String name() {
        return getClass().getName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {

    @Override
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {

    @Override
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Spiltter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}


interface Processor1 {

    String name();

    Object process(Object input);

}

//适配器设计模式

class FilterAdapter implements Processor1 {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }


    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.processor((Waveform) input);
    }
}