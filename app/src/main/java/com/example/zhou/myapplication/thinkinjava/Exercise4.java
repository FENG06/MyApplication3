package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/1.
 */

public class Exercise4 {


    float f4 = 1E-43f;


    static void f(Letter letter) {
        letter.c = 'z';
    }


    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c:" + x.c);
        f(x);
        System.out.println("2: x.c:" + x.c);


        double max = Double.MAX_VALUE;
        System.out.println(max);
        double min1 = Double.MIN_VALUE;
        double min2 = Double.MIN_NORMAL;
        double min3 = Double.MAX_EXPONENT;
        double min4 = Double.MIN_EXPONENT;

        System.out.println(min1 + "--" + min2 + "--" + min3 + "--" + min4);
        System.out.println("------------");

        int a = 0xaa;
        int b = 0x55;
        int a1 = 1;

        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~a1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(e));
        System.out.println(Integer.toBinaryString(f));
        System.out.println(Integer.toBinaryString(-1));

//        移位模式
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));


        byte b1 = -1;
        System.out.println(b >>> 10);


//        ---------------------------------------------


        double above = 0.7, below = 0.5;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above:" + (int) above);
        System.out.println("Math.round(above):" + Math.round(above));

        System.out.println("(int)below:" + (int) above);
        System.out.println("Math.round(below):" + Math.round(below));

        System.out.println("(int)fabove:" + (int) fabove);
        System.out.println("(int)fbelow:" + (int) fabove);


        String s = "Let's do some fun";

        String[] words = s.split(" ");//regex 正则表达式
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            System.out.println(res.append(new StringBuffer(word).reverse().toString() + " "));
//            return res.toString().trim();
        }
    }
}

class Letter {
    char c;
}

