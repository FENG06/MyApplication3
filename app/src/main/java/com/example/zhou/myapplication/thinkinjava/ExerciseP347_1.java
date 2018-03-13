package com.example.zhou.myapplication.thinkinjava;

import java.lang.reflect.Method;

/**
 * @author Zhou
 * @Date 2018/1/29
 */

public class ExerciseP347_1 {

    public static void main(String[] args) throws Exception {
        A346 a = ExerciseP347.makeA();
        a.f();


        System.out.println("现在的类名是" + a.getClass().getSimpleName());

        if (a instanceof C346) {
            C346 c = (C346) a;
            c.g();
        }

//         Compile error:cannot find symbol "C349"
//        if (a instanceof C349) {
//            C346 c = (C346) a;
//            c.g();
//        }


        System.out.println("------------------");

        claaHiddenMethod(a, "g");
        claaHiddenMethod(a, "u");
        claaHiddenMethod(a, "v");
        claaHiddenMethod(a, "w");
//  通过使用发射，仍旧可以调用所有方法，甚至是private方法
    }


    static void claaHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
