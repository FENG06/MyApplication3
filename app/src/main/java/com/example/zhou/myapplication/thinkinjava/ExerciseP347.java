package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/29
 */

public class ExerciseP347 {

    public static
    A346 makeA() {
        return new C346();
    }

}

class C346 implements A346 {

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

