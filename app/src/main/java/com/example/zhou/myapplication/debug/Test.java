package com.example.zhou.myapplication.debug;

import com.example.zhou.myapplication.thinkinjava.A346;

/**
 * @author Zhou
 * @Date 2018/1/29
 */

public class Test {

    public static A346 makeA() {
        return new C349();
    }

}

class C349 implements A346 {

    @Override
    public void f() {
        System.out.println("public C.f()");
    }


}