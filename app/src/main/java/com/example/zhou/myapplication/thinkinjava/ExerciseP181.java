package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/19.
 */

public class ExerciseP181 {
}

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1,I2{

    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 1;
    }
}

class C3 extends C implements I2{

    @Override
    public int f(int i) {
        return 1;
    }
}

class C4 extends C implements I3{
    @Override
    public int f() {
        return 1;
    }
}

//class C5 extends C implements I1{
//
//}