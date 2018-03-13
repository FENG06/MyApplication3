package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/29
 */

public class ExerciseP348 {

    public static void main(String[] args) throws Exception {
        A346 a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getSimpleName());


    }
}

class InnerA {

    private static class C implements A346 {

        @Override
        public void f() {
            System.out.println("public C.f()");
        }

        public void g() {
            System.out.println("public C.g()");
        }

        void u() {
            System.out.println("package C.u()");
        }

        protected void v() {
            System.out.println("protected C.v()");
        }

        private void w() {
            System.out.println("private C.w()");
        }
    }

    public static A346 makeA() {
        return new C();
    }
}