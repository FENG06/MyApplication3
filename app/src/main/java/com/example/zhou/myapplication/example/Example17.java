package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/11.
 */

public class Example17 extends A {
    static String string = "子类静态变量";

    Example17() {
        super("B");
        System.out.print("B");
        System.out.println(string);
    }

    static {
        System.out.println("子类静态代码块");

    }



    public static void main(String[] args) {
        new Example17();
    }
}

class C {
    C() {
        System.out.print("C");
    }
}

class A {
    static String string = "父类静态变量";

    {
        System.out.println("父类构造代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }


    C c = new C();

    A() {
        this("A");
        System.out.print("A");
    }

    A(String s) {
        System.out.print(s);
    }
}

