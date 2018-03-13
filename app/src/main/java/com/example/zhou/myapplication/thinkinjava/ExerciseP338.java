package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/24
 */

public class ExerciseP338 implements Interface {


    @Override
    public void doSomething() {

        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {

        System.out.println("somethingElse" + arg);

    }
}

class SimpleProxy implements Interface {


    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {

        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {

        System.out.println("SimpleProxy somethingElse" + arg);
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new ExerciseP338());
        consumer(new SimpleProxy(new ExerciseP338()));
    }
}
