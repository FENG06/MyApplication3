package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;
import java.util.List;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP313 {

    public static void main(String[] args) {
        List<Shape1> shape1List = Arrays.asList(new Circle1(), new Square1(), new Triangle1());


//        Shape对象实际执行什么样的代码，是由引用所指向的具体对象Circle....等决定的。
        for (Shape1 shape : shape1List) {

            shape.draw();

        }
    }


}


abstract class Shape1 {
    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    abstract public String toString();
}

class Circle1 extends Shape1 {

    @Override
    public String toString() {
        return "Circle1";
    }
}

class Square1 extends Shape1 {

    @Override
    public String toString() {
        return "Square1";
    }
}

class Triangle1 extends Shape1 {

    @Override
    public String toString() {
        return "Triangle1";
    }
}
