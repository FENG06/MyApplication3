package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/9/21.
 */

public class Example10 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1 = null;
        p2 = null;
        System.gc();
//        for (int i = 0; i < 1024; i++) {
//       System.out.println("你");
        }
    }

   class Person {
        public void finalize() {
            System.out.println("垃圾回收");
        }
    }

