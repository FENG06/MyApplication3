package com.example.zhou.myapplication.baseExample;

/**
 * Created by Zhou on 2017/10/25.
 */

public class Fruit extends Food {


    public static void main(String[] args) {
//        Plate<Fruit> plate = new Plate<Apple>(new Apple());

        Plate<? extends Fruit> p1 = new Plate<>(new Apple());


        //不能存入任何元素
//        p1.setItem(new Fruit());
//        p1.setItem(new Apple());


        //读取出来的东西只能存放在Fruit或它的基类里

        Fruit newFruit1 = p1.getItem();
        Object newFruit2 = p1.getItem();
//        Apple newApple3 = p1.getItem();


        Plate<? super Fruit> p2 = new Plate<>(new Food());

        Plate<? super Fruit> p3 = new Plate<>(new Meal());


//        存入元素正常
        p2.setItem(new Fruit());
        p2.setItem(new Apple());
//        p2.setItem(new Food());

//        Apple newFriuit3 = p2.getItem();
//        Apple newFriuit4 = p3.getItem();
//
//        Fruit newFruit5 = p2.getItem();

        Object newFruit6 = p2.getItem();
    }


}


class Meal {
}

class Food extends Meal {
}

class Apple extends Fruit {
}

class Plate<T> {
    private T item;

    public Plate(T t) {
        this.item = t;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}