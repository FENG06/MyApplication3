package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP197 {

    public Contents1 contents() {
        return new Contents1() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        ExerciseP197 p = new ExerciseP197();
        Contents1 c = p.contents();
        Mycontents mycontents = p.new Mycontents();

    }


    class Mycontents implements Contents1 {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }

        public Contents1 contents1() {
            return new Mycontents();
        }
    }


}

interface Contents1 {
    int value();
}