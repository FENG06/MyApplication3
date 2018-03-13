package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/9.
 */

class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }

}


class OnoffException1 extends Exception {
}

class OnoffException2 extends Exception {
}

public class ExerciseP266 {
    private static Switch sw = new Switch();

    public static void f() throws OnoffException1, OnoffException2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (OnoffException1 onoffException1) {
            onoffException1.printStackTrace();
            sw.off();
        } catch (OnoffException2 onoffException2) {
            onoffException2.printStackTrace();
            sw.off();
        }
    }
}