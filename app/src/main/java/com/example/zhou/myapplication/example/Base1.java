package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/12.
 */

public class Base1 {

    private String baseName = "base";

    public Base1() {
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    static class Sub extends Base1 {
        private String baseName = "sub";

        @Override
        public void callName() {
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        Base1 base1 = new Sub();
        System.out.println(base1.baseName = "水果");
    }

}
