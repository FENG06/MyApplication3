package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/20.
 */

public class ExerciseP191_2 {


    class Inner {

        public Inner() {
            System.out.println("内部类测试");
        }
    }


    public Inner get() {
        return new Inner();
    }

    public static void main(String[] args) {

        ExerciseP191_2 exerciseP191_2 = new ExerciseP191_2();

        ExerciseP191_2.Inner inner =  exerciseP191_2.get();
    }

}
