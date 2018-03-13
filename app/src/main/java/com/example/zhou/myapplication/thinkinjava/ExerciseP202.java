package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP202 {

    public void f() {
        System.out.println("f()");
    }

    public static class Test202 {
        public static void main(String[] args) {
            ExerciseP202 e = new ExerciseP202();
            e.f();
        }
    }


    public static void main(String[] args) {
        ExerciseP202 e = new ExerciseP202();
    }

}

interface ClassInInterface {

    void howdy();

    //接口中的任何类都默认为public和static

    class Test implements ClassInInterface {

        @Override
        public void howdy() {
            System.out.println("Howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
