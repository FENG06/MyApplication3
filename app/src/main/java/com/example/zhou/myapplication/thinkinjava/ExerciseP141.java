package com.example.zhou.myapplication.thinkinjava;

import java.util.Random;

/**
 * Created by Zhou on 2017/11/10.
 */

class Value {

    int i;

    public Value(int i) {
        this.i = i;
    }

}

public class ExerciseP141 {

    private static Random rand = new Random(47);
    private String id;

    public ExerciseP141(String id) {
        this.id = id;
    }

    //compile-time constants

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    //typical public constant

    public static final int VALUE_THREE = 39;

//    cannot be compile-time constant

    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private final Value getV2 = new Value(222);
    public static final Value VAL_3 = new Value(33);

    //Arrays

    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4= " + i4 + ",INT_5=" + INT_5;
    }


    public static void main(String[] args) {
        ExerciseP141 fd1 = new ExerciseP141("fd1");
//        fd1.valueOne++;

        //final修饰的引用内容可以改变
        fd1.v2.i++;

        //final修饰的引用地址不可以改变
//        fd1.v2 = fd1.v1;

        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {

            fd1.a[i]++;
//            fd1.v2=new Value(0);

            System.out.println(fd1);
            System.out.println("Creating new FinalData");
            ExerciseP141 fd2 = new ExerciseP141("fd2");

            System.out.println(fd1);
            System.out.println(fd2);
        }
    }
}


