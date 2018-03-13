package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise24 {


    public static void main(String[] args) {
        House h = new House();
        h.f();
    }


}

class Window {
    public Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1);

    House() {
        System.out.println("House()");

        w3 = new Window(33);
    }


    Window w2 = new Window(2);

    void f() {

        Window w4 = new Window(4);
        System.out.println("f()");
    }

    Window w3 = new Window(3);

}
