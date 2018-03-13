package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/17.
 */

public class ExerciseP172 {

    public static void main(String[] args) {

        NullAbstract n = new SecondMethod();
        SecondMethod.g(n);
    }
}

abstract class NullAbstract {

    public static final int i = 1;

    abstract void f();

}

class SecondMethod extends NullAbstract {

    private static NullAbstract nullAbstract;

    @Override
    void f() {

        System.out.println("测试中...");
    }

    static void g(NullAbstract nullAbstract) {
        SecondMethod.nullAbstract = nullAbstract;
        nullAbstract.f();
    }

}

interface Instrument173{

    int VALUE = 5;
    void f();
}