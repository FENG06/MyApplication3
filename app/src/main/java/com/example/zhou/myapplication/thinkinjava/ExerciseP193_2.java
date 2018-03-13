package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP193_2 {

    class Contents {
        private int i = 1;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        ExerciseP193_2 p = new ExerciseP193_2();
        //must use instance of  outer class to create an instance of the inner class
        ExerciseP193_2.Contents c = p.new Contents();
        ExerciseP193_2.Destination d = p.new Destination("Tasmania");
    }


}
