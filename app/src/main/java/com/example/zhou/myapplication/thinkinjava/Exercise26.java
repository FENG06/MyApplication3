package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise26 {

    public static void main(String[] args) {

        System.out.println("Inside main()");
//        Cups.cup1.f(99);

    }

        static Cups cups1 = new Cups();
        static Cups cups2 = new Cups();

}

class Cup {

    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Cups{
//    static Cup cup1;
//    static Cup cup2;
    static {
        Cup cup1 = new Cup(1);
        Cup cup2 = new Cup(2);
    }

    public Cups() {
        System.out.println("Cups()");
    }
}
