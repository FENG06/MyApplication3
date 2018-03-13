package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP322_1 {

    public static void main(String[] args) {

        Building b = new House1();
        Class<House1> houseType = House1.class;
        House1 h = houseType.cast(b);
        h = (House1) b;

    }
}

class Building {
}

class House1 extends Building {

}