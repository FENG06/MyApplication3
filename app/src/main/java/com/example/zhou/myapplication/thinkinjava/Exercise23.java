package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise23 {

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    Exercise23 reference;

    void printInitialValues() {

        Exercise23 exercise23 = new Exercise23();

        System.out.println("Data type Initial value ");
        System.out.println("boolean " + t);
        System.out.println("char [" + c + "]");
        System.out.println("byte "+b);
        System.out.println("short "+s);
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+f);
        System.out.println("double "+d);

    }

    public static void main(String[] args) {
        Exercise23 exercise23 = new Exercise23();
        exercise23.printInitialValues();

        new Exercise23().printInitialValues();
    }

}
