package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/8.
 */

public class ExerciseP127 extends Cleanser {

    @Override
    public void scrub() {

        append("Detergent.scrub()");
        super.scrub();
    }

    public void foam() {

        append("foam()");
    }

    public static void main(String[] args) {
        ExerciseP127 x = new ExerciseP127();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Test base class");
        Cleanser.main(args);
    }
}


class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        //“+=”将几个String对象连接成s
        s += a +" ";
    }

    public void dilute() {
        append("dilute()");
    }

    public void apply() {
        append("apply()");
    }

    public void scrub() {
        append("scrub()");
    }

    @Override
    public String toString() {
        return s;
    }


    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

