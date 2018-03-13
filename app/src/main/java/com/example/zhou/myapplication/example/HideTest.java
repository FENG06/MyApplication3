package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/12.
 */

public class HideTest {
    public static void main(String[] args) {
        Derived d = new Derived();
        Parent p = new Parent();
        System.out.println(p.tag);
        System.out.println(((Parent)d).tag);

    }
}

class Parent {
    public String tag = "父类字符串";
}


class Derived extends Parent {
    private String tag = "子类私有字符串";

}
