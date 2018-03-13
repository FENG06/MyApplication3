package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/13.
 */

public class Example20 extends Example21 {

    public String book = "轻量级Java EE企业应用实战";

    public void test() {
        System.out.println("子类的覆盖方法");
    }

    public void sub() {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        Example21 example21 = new Example21();
        System.out.println(example21.book);
        example21.base();
        example21.test();

        Example20 example20 = new Example20();
        System.out.println(example20.book);
        example20.base();
        example20.test();
        example20.sub();

//        多态发生
        Example21 example211 = new Example20();
//        输出6 表明访问的是父类Field
        System.out.println(example211.book);
        example211.base();
        example211.test();
//        example211.sub();
    }
}


class Example21 {
    public int book = 6;

    public void base() {
        System.out.println("父类的普通方法");
    }

    public void test() {
        System.out.println("父类的被覆盖的方法");
    }

}
