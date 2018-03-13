package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/31
 */

public class ExerciseP354<T> {

    private T a;

    public ExerciseP354(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {

        ExerciseP354<Automobile> h3 = new ExerciseP354<>(new Automobile());
        Automobile a = h3.get();

        //        h3.set("Not an Automobile");
        //        h3.set(1);

        ExerciseP354<Automobile2> h4 = new ExerciseP354<>(new Automobile2());


    }

}

class Automobile {
}

class Automobile2 extends Automobile {

}