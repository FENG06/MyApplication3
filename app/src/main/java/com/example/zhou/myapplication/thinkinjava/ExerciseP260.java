package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/9.
 */

public class ExerciseP260 {

    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("throw from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException e) {
            System.out.println("Caught in outer try");
            e.printStackTrace(System.out);
        }
    }

}

class OneException extends Exception {
    public OneException(String message) {
        super(message);
    }
}

class TwoException extends Exception {
    public TwoException(String message) {
        super(message);
    }
}
