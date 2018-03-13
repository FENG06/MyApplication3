package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP193 {


    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        int i = 10;

        class test{

        }
        public ExerciseP193 outer() {
            return ExerciseP193.this;
        }
    }


    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        ExerciseP193 dt = new ExerciseP193();
        ExerciseP193.Inner dti = dt.inner();
        ExerciseP193.Inner dti1 = dt.new Inner();

        //ExerciseP193.Inner dti2 = dt.new ExerciseP193.Inner();


        dti.outer().f();
    }


}
