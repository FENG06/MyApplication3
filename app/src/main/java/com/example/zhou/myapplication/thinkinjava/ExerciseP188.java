package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/20.
 */

public class ExerciseP188 {

    public static void playGame(GameFactory gameFactory) {

        Game s = gameFactory.getGame();
        while (s.Move()) {
        }
    }

    public static void main(String[] args) {

        playGame(new CheckFactory());
        playGame(new ChessFactory());

    }

}


interface Game {

    boolean Move();
}

interface GameFactory {
    /**
     * @return 判断游戏的类型工厂
     */
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;
    public static final int MOVES = 3;

    @Override
    public boolean Move() {

        System.out.println("Checkers move" + moves);
        return ++moves != MOVES;
    }
}

class CheckFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game {

    private int moves = 0;
    public static final int MOVES = 4;

    @Override
    public boolean Move() {
        System.out.println("Chess move" + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}


