package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP198 {

    public Desination desination(final String dest) {
        return new Desination() {

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        ExerciseP198 p = new ExerciseP198();
        Desination d = p.desination("Tasmania");
    }
}
