package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/29
 */

public class ExerciseP346 {


    public static void main(String[] args) {
        A346 a = new B346();
        a.f();
//        a.g();
        System.out.println(a.getClass().getSimpleName());
        if (a instanceof B346) {
            B346 b = (B346) a;
            b.g();
        }
        B346 b = new C345();
//        b.h();
    }


}

class B346 implements A346 {

    @Override
    public void f() {

    }

    public void g() {

    }
}

class C345 extends B346 {

    @Override
    public void f() {
        super.f();
    }

    @Override
    public void g() {
        super.g();
    }

    public void h() {
        System.out.println("测试");
    }
}

