package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise18 {

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}


class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Apple {

    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        return apple;
    }

}

