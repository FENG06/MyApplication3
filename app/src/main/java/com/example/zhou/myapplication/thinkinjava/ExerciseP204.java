package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP204 {

    static void takesA(A204 a) {
    }

    static void takesB(B204 b) {
    }

    static void takesD(D d) {

    }

    static void takesE(E204 e) {

    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());

        System.out.println("-----分割线-----");

        Z z = new Z();
        takesD(z);
        takesE(z.makeE());

    }

}

interface A204 {
}

interface B204 {
}

class X implements A204, B204 {
}

class Y implements A204 {
    B204 makeB() {
        //匿名内部类
        return new B204() {
        };
    }

}

class D {
}

abstract class E204 {
}

class Z extends D {
    E204 makeE() {
        return new E204() {
        };
    }
}

