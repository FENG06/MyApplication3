package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP200 {

    public static void serviceConsumer(ServiceFactory200 factory) {
        Service200 s = factory.getService();
        s.method1();
        s.method2();
    }


    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory200);
        serviceConsumer(Implementation.factory200);
    }


}

interface Service200 {
    void method1();

    void method2();
}

interface ServiceFactory200 {
    Service200 getService();
}

class Implementation1 implements Service200 {

    private Implementation1() {
    }

    @Override
    public void method1() {

        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");

    }

    public static ServiceFactory200 factory200 = new ServiceFactory200() {

        @Override
        public Service200 getService() {
            return new Implementation1();
        }
    };
}


class Implementation implements Service200 {

    private Implementation() {
    }

    @Override
    public void method1() {

        System.out.println("method3");
    }

    @Override
    public void method2() {
        System.out.println("method4");

    }

    public static ServiceFactory200 factory200 = new ServiceFactory200() {

        @Override
        public Service200 getService() {
            return new Implementation();
        }
    };
}

