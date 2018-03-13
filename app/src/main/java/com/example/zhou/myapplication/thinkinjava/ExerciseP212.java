package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/11.
 */

public class ExerciseP212 extends WithInner.Inner {


    ExerciseP212(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        ExerciseP212 ii = new ExerciseP212(wi);

    }
}

class WithInner {
    class Inner {
    }
}

