package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/29
 */

public class ExerciseP349 {

    public static void main(String[] args) throws Exception {
        A346 a = AnonymousA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        System.out.println(a.getClass().getSimpleName());
        /*
          Reflection still gets into the private class:
          */
        ExerciseP347_1.claaHiddenMethod(a, "g");
        ExerciseP347_1.claaHiddenMethod(a, "u");
        ExerciseP347_1.claaHiddenMethod(a, "v");
        ExerciseP347_1.claaHiddenMethod(a, "w");

    }
}

class AnonymousA {
    public static A346 makeA() {
        return new A346() {
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

        };
    }
}
