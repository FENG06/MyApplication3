package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/8.
 */

public class ExerciseP252 {

    public static void f() throws MyException {

        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {

        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }


    public static void main(String[] args) {

        try {

            f();

        } catch (MyException e) {
            e.printStackTrace(System.out);
        }


        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        } finally {
            System.out.println("finally 语句得到的运行");
        }

    }


}


class MyException extends Exception {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}


