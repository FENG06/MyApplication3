package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/11.
 */

public class Fruit {
    //静态代码块
    static {
        System.out.println("In Fruit static");
    }

    private Inner i = new Inner();

    public Fruit() {
        System.out.println("Before Fruit Constructor");
        show();//由于多态特性，此处子类Apple覆盖的方法会被调用
        System.out.println("After Fruit static");
    }

    public void show() {
        System.out.println("show:Fruit.");
    }

    public class Inner {
        Inner(){
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        new Apple(3);
    }


}


class Apple extends Fruit {

    static {
        System.out.println("In Apple static");
    }

    private int weight = 1;

    public Apple(int para_weight) {
        System.out.println("Before Apple Constructor：weight ="+weight);
        weight = para_weight;
        System.out.println("Apple Constructor：weight ="+weight);
    }
//    @Override
//    public void show(){
//
//    }

    @Override
    public void show() {
        System.out.println("show apple：weight ="+weight);
    }
}
