package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/17.
 */

public class ExerciseP171 {

    public static void main(String[] args) {

        SubAstract subAstract = new SubAstract();
        subAstract.print();
    }

}


abstract class BaseAbstract {

    abstract void print();


    public BaseAbstract() {
        print();
    }
}


class SubAstract extends BaseAbstract {

    private int i = 10;

    @Override
    void print() {

        System.out.println(i);
    }
}