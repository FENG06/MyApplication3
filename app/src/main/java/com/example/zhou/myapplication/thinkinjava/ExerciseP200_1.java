package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP200_1 {

    public static void playGame(GameFactory200 factory) {
        Game200 s = factory.getGame();
        while (s.move()) {

        }
    }


    public static void main(String[] args) {
        playGame(Checkers200.factory);
        playGame(Chess200.factory);
    }
}

interface Game200 {
    boolean move();
}

interface GameFactory200 {
    Game200 getGame();
}

class Checkers200 implements Game200 {

    private Checkers200() {

    }

    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move" + moves);
        return ++moves != MOVES;
    }

    public static GameFactory200 factory = new GameFactory200() {

        @Override
        public Game200 getGame() {
            return new Checkers200();
        }
    };
}


class Chess200 implements Game200 {

    private Chess200() {

    }

    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move" + moves);
        return ++moves != MOVES;
    }

    public static GameFactory200 factory = new GameFactory200() {

        @Override
        public Game200 getGame() {
            return new Chess200();
        }
    };
}