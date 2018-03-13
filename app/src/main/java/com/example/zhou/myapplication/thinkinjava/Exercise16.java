package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise16 {


    void bark(String animal, int age) {
        System.out.println(animal + "的叫声" + age);
    }

    void bark(int age, String animal) {
        System.out.println(age + "是" + animal);
    }


    public static void main(String[] args) {
        Exercise16 exercise16 = new Exercise16();
        exercise16.bark("狗",10);
        exercise16.bark(10,"汪汪");


    }


}
