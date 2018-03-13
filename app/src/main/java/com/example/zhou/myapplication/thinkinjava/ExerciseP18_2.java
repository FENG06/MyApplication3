package com.example.zhou.myapplication.thinkinjava;

import java.util.Random;

/**
 * Created by Zhou on 2017/11/20.
 */

public class ExerciseP18_2 {
    public static void getFactory(GambleFactory gambleFactory) {
        Gamble gamble = gambleFactory.getGamble();
        gamble.throwObject();
    }

    public static void main(String[] args) {

        getFactory(new CoinsFactory());
    }


}

interface Gamble {
    void throwObject();
}

interface GambleFactory {
    Gamble getGamble();
}

class Coins implements Gamble {

    int count;

    public Coins(int count) {
        this.count = count;
    }

    @Override
    public void throwObject() {

        if (count == 1) {
            System.out.println("正面");
        }

        if (count == 0) {
            System.out.println("反面");
        }
        if (count == 2) {
            System.out.println("反面");
        }
        if (count == 3) {
            System.out.println("反面");
        }
        if (count == 4) {
            System.out.println("反面");
        }
        if (count == 5) {
            System.out.println("反面");
        }
        if (count == 6) {
            System.out.println("反面");
        }
        if (count == 7) {
            System.out.println("反面");
        }
        if (count == 8) {
            System.out.println("反面");
        }

        if (count == 9) {
            System.out.println("反面");
        }
        if (count == 10) {
            System.out.println("反面");
        }



    }
}

class CoinsFactory implements GambleFactory {

    Random random = new Random();
    int num = random.nextInt(10);

    @Override
    public Gamble getGamble() {
        return new Coins(num);
    }
}