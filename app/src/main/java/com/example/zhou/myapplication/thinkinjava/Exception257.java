package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @date 2018/1/8
 */

public class Exception257 {

    public static void f() {

        try {
            throw new Exception1();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }

        try {
            throw new Exception2();
        } catch (Exception2 exception2) {
            exception2.printStackTrace();
        }

        try {
            throw new Exception3();
        } catch (Exception3 exception3) {
            exception3.printStackTrace();
        }

    }


    public static void main(String[] args) {
//        try {
//            throw new Exception("My Exception");
//        } catch (Exception e) {
//
//            System.out.println("Catch Exception");
//            System.out.println("getMessage():" + e.getMessage());
//            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
//            System.out.println("toString():" + e);
//            System.out.println("printStackTrace:");
//            e.printStackTrace(System.out);
//        }


        try {
            f();
        } catch (Exception e) {
            System.out.println("捕获所有异常");
        }
    }


}

class Exception1 extends Exception {

}

class Exception2 extends Exception {

}

class Exception3 extends Exception {

}