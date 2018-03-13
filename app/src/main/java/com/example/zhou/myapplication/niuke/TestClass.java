package com.example.zhou.myapplication.niuke;

/**
 * Created by Zhou on 2017/11/7.
 */

public abstract class TestClass {

    private static void testMethod() {
        System.out.println("testMethod");
    }


    public  abstract void test();


    public static void main(String[] args) {
        ((TestClass) null).testMethod();


        Boolean flag = true;
        System.out.println(flag);
        if (flag == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(flag);
    }

}

abstract class TestAbstract extends TestClass{

//    @Override
//    public void test() {
//
//    }
}