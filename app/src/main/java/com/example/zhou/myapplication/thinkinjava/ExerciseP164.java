package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/17.
 */

public class ExerciseP164 {

    public static void main(String[] args) {


        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }


}


class Grain {
    @Override
    public String toString() {
        return "Grain{}";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat{}";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {

    @Override
    Wheat process() {
        return new Wheat();
    }
}

