package com.example.zhou.myapplication.debug;

import com.example.zhou.myapplication.baseExample.Animal;

/**
 * Created by Zhou on 2017/11/8.
 */

class Dog extends Animal {


    public void run(String s){
        System.out.println(s);
    }

    void leg(int i){
        System.out.println("有" + i + "条腿");
    }




    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name("小鸡");
        dog.shout("吱吱吱");
    }

}
