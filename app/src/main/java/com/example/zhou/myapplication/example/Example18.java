package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/12.
 */

public class Example18 extends Example19 {

    public String color;


    public Example18(double size, String name, String color) {
        super(size, name);
        this.color = color;
    }

    public Example18() {
        super();
    }

    public static void main(String args[]) {
        Example18 example18 = new Example18(5.6, "测试对象", "红色");
        System.out.println(example18.size+"--"+example18.name+"--"+example18.color);
//        System.out.println(example18.size);
    }


}

class Example19 {

    public double size;
    public String name;

    public Example19(double size, String name) {
        this.size = size;
        this.name = name;
    }


    public Example19() {

    }
}