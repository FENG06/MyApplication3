package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/20.
 */

public class ExerciseP191 {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    static class Destination {
        private String label;

        public Destination(String whereTo) {
            this.label = whereTo;
        }

        String readLable() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLable());
    }


    public static void main(String[] args) {
        ExerciseP191 p = new ExerciseP191();
        p.ship("Tasmania");
        ExerciseP191 q = new ExerciseP191();
        ExerciseP191.Contents c = q.contents();
        ExerciseP191.Destination d = q.to("Borneo");
    }
}
