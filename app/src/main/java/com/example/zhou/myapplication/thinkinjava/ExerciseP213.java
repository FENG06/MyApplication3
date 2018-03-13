package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/11.
 */

public class ExerciseP213 extends Egg {

    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new ExerciseP213();
    }
}

class Egg {

    private Yolk y;

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}
