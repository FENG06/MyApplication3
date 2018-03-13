package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/17.
 */

public class ExampleP163 {

    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(6);
    }


}


class Glyph {

    void draw() {
        System.out.println("Glyph.draw()");
    }

    final void erase() {
        System.out.println("Glyph.erase()");
    }

    public Glyph() {
        System.out.println("Glyph() before draw");
        System.out.println("Glyph() before erase");

        draw();
        erase();
        System.out.println("Glyph() after draw");
        System.out.println("Glyph() after erase");
    }
}


class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int r) {
        this.radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius =" + radius);
    }


    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius =" + radius);
    }


}

class RectangularGlyph extends Glyph {

    private int width = 10;

    public RectangularGlyph() {
    }

    public RectangularGlyph(int width) {
        this.width = width;
        System.out.println("RectangularGlyph() , width = " + width);
    }

    @Override
    void draw() {
        System.out.println("RectangularGlyph().draw() , width = " + width);
    }
}