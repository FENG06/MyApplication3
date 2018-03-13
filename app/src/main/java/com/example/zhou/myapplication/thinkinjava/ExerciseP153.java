package com.example.zhou.myapplication.thinkinjava;

import java.util.Random;

/**
 * Created by Zhou on 2017/11/12.
 */

public class ExerciseP153 {

    private static RandowShapeGenerator gen = new RandowShapeGenerator();

    public static void main(String[] args) {
        Shape153[] s = new Shape153[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }

        for (Shape153 shape153 : s) {

            shape153.draw();

        }
    }


}


class Shape153 {

    public void draw() {
    }

    public void erase() {
    }

    public void print1() {
        System.out.println("打印信息");
    }
}

class Circle extends Shape153 {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void print1() {
        System.out.println("Circle()打印信息");
    }
}

class Square extends Shape153 {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class RandowShapeGenerator {
    private Random random = new Random(47);

    public Shape153 next() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
        }
    }
}


