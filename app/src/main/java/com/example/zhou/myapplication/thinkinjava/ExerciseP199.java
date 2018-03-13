package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP199 {

    public static Base getBase(int i) {

        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }

            @Override
            public void f() {

                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }


}

abstract class Base {

    public Base(int i) {
        System.out.println("Base constructor,i=" + i);
    }

    public abstract void f();
}
