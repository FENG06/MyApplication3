package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/10.
 */

public class ExerciseP146 extends Insect {


    private int k = printInit("Beetle.k initialized");

    public ExerciseP146() {
        System.out.println("k = " + k);
        System.out.println("j =" + j);
    }


    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {

        System.out.println("Beetle constructor");

        ExerciseP146 Beetle = new ExerciseP146();
    }

}


class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println(("i=" + i + ",j=" + j));
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }


}