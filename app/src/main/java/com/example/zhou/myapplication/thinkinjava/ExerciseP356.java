package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/31
 */

public class ExerciseP356 {


    static ExerciseP354_1<String, Integer> f() {

//        Autoboxing coverts the int to Integer
        return new ExerciseP354_1<>("hi", 47);

    }


    static ExerciseP355<Amphibian356, String, Integer> g() {

        return new ExerciseP355<>(new Amphibian356(), "hi", 47);
    }


    static ExerciseP355_1<Vehicle, Amphibian356, String, Integer> h() {
        return new ExerciseP355_1<>(new Vehicle(), new Amphibian356(), "hi", 47);
    }

    static ExerciseP355_2<Vehicle, Amphibian356, String, Integer, Double> k() {

        return new ExerciseP355_2<>(new Vehicle(), new Amphibian356(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {

        ExerciseP354_1<String, Integer> ttsi = f();
        System.out.println(ttsi);
//        ttsi.first = "there";
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());


    }

}

class Amphibian356 {
}

class Vehicle {
}
