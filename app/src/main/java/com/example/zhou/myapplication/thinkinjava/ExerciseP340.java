package com.example.zhou.myapplication.thinkinjava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Zhou
 * @Date 2018/1/25
 */

public class ExerciseP340 {

    public static void main(String[] args) {
        SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(),
                new Class[]{SomeMethods.class},
                new MethodSelector(new Implementation3()));
        proxy.boring1();
        proxy.boring2();
        proxy.boring3();
        proxy.interesting("bonobo");

    }

}


class MethodSelector implements InvocationHandler {

    private Object proxied;

    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("interesting".equals(method.getName()))

        {
            System.out.println("Proxy detected the interesting method");
        }

        return method.invoke(proxied, args);
    }
}

interface SomeMethods {

    void boring1();

    void boring2();

    /**
     * @param arg 传递参数
     */
    void interesting(String arg);

    void boring3();
}

class Implementation3 implements SomeMethods {
    @Override
    public void boring1() {
        System.out.println("boring1");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public void interesting(String arg) {
        System.out.println("interesting" + arg);
    }

    @Override
    public void boring3() {
        System.out.println("boring3");
    }
}