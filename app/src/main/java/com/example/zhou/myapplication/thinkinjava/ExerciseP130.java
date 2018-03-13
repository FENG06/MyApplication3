package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/8.
 */

public class ExerciseP130 extends Root {

    public static void main(String[] args) {

        System.out.println("ExerciseMain");
        new Stem();

        Component1 component1 = new Component1();
        Component2 component2 = new Component2();
        Component3 component3 = new Component3();
    }

    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

}

class Stem extends Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Stem() {
        System.out.println("Stem");
    }

}

class Root {


    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Root() {
        System.out.println("Root");

    }

}

class Component1 {

    public Component1() {
        System.out.println("Component1");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component1");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component1");
    }
}