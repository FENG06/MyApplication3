package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/17.
 */

public class ExerciseP167 {

    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
        ((MoreUseful) x[1]).u();
        ((MoreUseful) x[0]).u();
    }

}


class Useful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful {
    @Override
    public void f() {
    }

    @Override
    public void g() {
    }

    public void u() {

    }

    public void v() {

    }

    public void w() {

    }
}
