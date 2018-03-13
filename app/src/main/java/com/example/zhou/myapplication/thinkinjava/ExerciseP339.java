package com.example.zhou.myapplication.thinkinjava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Zhou
 * @Date 2018/1/24
 */

public class ExerciseP339 {

    public static void consumer(Interface iface) {

        iface.doSomething();
        iface.somethingElse(" bonobo");

    }

    public static void main(String[] args) throws InterruptedException {
        ExerciseP338 real = new ExerciseP338();
        consumer(real);
//        Insert a proxy and call again:

        /**
         * 通过调用静态方法创建动态代理，这个方法需要一个类加载器，一个你希望该代理实现的接口列表（不是类或抽象类），以及InvocationHandler接口的一个实现
         * */
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));

        consumer(proxy);

    }

}


class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", methdo: " + method + ", args: " + args);

        if (args != null) {

            for (Object arg : args) {

                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}
