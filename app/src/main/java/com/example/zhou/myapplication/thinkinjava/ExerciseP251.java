package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/8.
 */

public class ExerciseP251 {

    public void f() throws SimpleException {

        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {

        ExerciseP251 sed = new ExerciseP251();

        try {
            sed.f();
        } catch (SimpleException e) {

            System.out.println("Catch it!");

        }
    }


}

class SimpleException extends Exception {
}
