package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/10.
 */

public class Example15 {

    public static void main(String[] args) {
        Person11.sayHello();

//        Outer.Inner inner = new Outer().new Inner();
//        inner.show();

//          Outer.Inner inner = new Outer.Inner();

//        Outer outer = new Outer();
//        Outer.Inner inner = outer.Inner();
    }


}

class Person11 {
    static int ny = 1;
//    int goto =1;

    public static void sayHello() {
        System.out.print("你好！");
    }
}

class Single {

    private static Single INSTANCE = new Single();

    private Single() {
    }

    public static Single getInstance() {
        return INSTANCE;
    }
}

class Outer {
    private int num = 4;

    public void test() {


        class Inner {
            public void show() {
                System.out.println("test");
            }
        }

        Inner inner = new Inner();
        inner.show();

    }


}