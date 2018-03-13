package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/10.
 */

public class ExerciseP143 {

    void with(final Gizmo g) {
//        g = new Gizmo();
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    void f(final int i) {
//        i++;
    }

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        ExerciseP143 bf = new ExerciseP143();
        bf.without(null);
        bf.with(null);
    }

}


class Gizmo {
    public void spin() {
    }
}

class Chile extends Gizmo{

}