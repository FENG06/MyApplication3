package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP203 {

    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }

}

class MNA {
    private void f() {
    }

    class A {
        private void g() {
        }


        public class B {
            void h() {
                g();
                f();
            }

        }


    }
}
