package com.example.zhou.myapplication.thinkinjava;

import java.util.Random;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP319 {


    public static Random random = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {


        /**
         *仅使用.class语法来获得对类的引用是不会引发初始化。但是为了产生Class引用
         * Class.forName就立即跟进进行初始化
         *
         * 如果一个static final 是“编译期常量”，那么这个值不需要进行初始化就可以被读取
         *
         * 如果一个static域不是final的，那么在它被读取之前，要先进行链接和初始化
         * */
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");

//        Does not trigger initialization
        System.out.println(Initable.staticFinal);
//        Does trigger initialization
        System.out.println(Initable.getStaticFina2);
//        Does not trigger initialization
        System.out.println(Initable2.staticNonFinal);

        Class initable3 = Class.forName("com.example.zhou.myapplication.thinkinjava.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);

    }
}


class Initable {

    static final int staticFinal = 47;
    static final int getStaticFina2 = ExerciseP319.random.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }

}

class Initable2 {

    static final int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}