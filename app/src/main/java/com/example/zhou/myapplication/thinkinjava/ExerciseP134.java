package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/9.
 */

public class ExerciseP134 extends Shape {

    private Circile c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public ExerciseP134(int i) {
        super(i);

        for (int j = 0; j < lines.length; j++) {

            lines[j] = new Line(j, j * j);
            c = new Circile(1);
            t = new Triangle(1);
            System.out.println("Combined constructor");

        }
    }


    @Override
    void dispose() {
        System.out.println("Combined.dispose");
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        ExerciseP134 x = new ExerciseP134(47);
        try {

        } finally {
            x.dispose();
        }
    }
}

class Shape {
    public Shape(int i) {
        System.out.println("Shape constructor");
    }

    void dispose() {
        System.out.println("Shape dispose");
    }

}

class Circile extends Shape {
    public Circile(int i) {
        super(i);
        System.out.println("Drawing circle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {

    public Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");

    }

    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}


class Line extends Shape {
    private int start, end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing line:" + start + "," + end);
    }

    @Override
    void dispose() {
        System.out.println("Erasing line:" + start + "," + end);
        super.dispose();
    }
}