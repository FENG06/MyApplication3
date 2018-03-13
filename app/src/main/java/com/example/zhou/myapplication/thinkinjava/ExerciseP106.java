package com.example.zhou.myapplication.thinkinjava;

import static com.example.zhou.myapplication.thinkinjava.ExerciseP106.NOT;

/**
 * Created by Zhou on 2017/11/7.
 */

public enum ExerciseP106 {
    NOT, MILD, MEDIUM, HOT, FLAMING
}


class SimpleEnumUse {

    public static void main(String[] args) {
        ExerciseP106 exerciseP106 = ExerciseP106.MEDIUM;
        System.out.println(exerciseP106);

    }

}

class EunmOrder {
    public static void main(String[] args) {
        for (ExerciseP106 exerciseP106 : ExerciseP106.values()) {

            System.out.println(exerciseP106 + ", ordinal " + exerciseP106.ordinal());

        }
    }
}

class Burrito {

    ExerciseP106 degree;

    public Burrito(ExerciseP106 degree) {
        this.degree = degree;
    }


    public void describe() {
        System.out.println("This burrito is");


        switch (degree) {

            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("A little hot");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe to hot");
        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(ExerciseP106.NOT),
                greenChile = new Burrito(ExerciseP106.MEDIUM),
                jalapeno = new Burrito(ExerciseP106.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();

    }
}