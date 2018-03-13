package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/13.
 */

public class ExerciseP158 extends Amphibian {

    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public ExerciseP158() {
        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        ExerciseP158 frog = new ExerciseP158();



        System.out.println("Bye!");
        frog.dispose();
    }
}


class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic" + s);
    }

    protected void dispose() {
        System.out.println("disposing Characteristic" + s);
    }

}

class Description {
    private String s;

    public Description() {
    }

    public Description(String s) {
        this.s = s;
        System.out.println("Creating Description" + s);
    }

    protected void dispose() {
        System.out.println("disposing Description");
    }
}

class LivingCreature {
    Description description1 = new Description();
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");

    public Animal() {
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        t.dispose();
        p.dispose();
        super.dispose();
    }
}


class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("Amphibian dispose");
        super.dispose();
    }
}

