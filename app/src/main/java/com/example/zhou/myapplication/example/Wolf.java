package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/12.
 */

public class Wolf extends Animal {

    public Wolf() {
        super("灰太狼", 3);
        System.out.println("Wolf无参的构造器");

    }

    public static void main(String[] args) {
        new Wolf();

        Creature creature = new Creature();
        Animal animal = new Animal();
        animal = (Animal) creature;
        creature = animal;
        Example example = new Example();
    }
}

class Animal extends Creature {


    public Animal() {
    }

    public Animal(String name) {
        System.out.println("Animal 带两个参数的构造器," + "名字为" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal 带两个参数的构造器," + "年龄为" + age);
    }



    @Override
    public void run() {

    }


}

class Creature {
    public Creature() {
        System.out.println("Creature无参的构造器");
    }
    public void run(){
        System.out.println("动物会跑");
    }


}
