package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/10.
 */

public class ExerciseP140 {


    public void length(int i) {
        System.out.println("跳的距离" + i);
    }

    public void jump(ExerciseP140 amphibian, int i) {
        amphibian.length(i);
    }


}


class Frog extends ExerciseP140 {

    @Override
    public void length(int i) {
        System.out.println("test");
        super.length(i);
    }

    @Override
    public void jump(ExerciseP140 amphibian, int i) {
        super.jump(amphibian, i);
    }


    public static void main(String[] args) {

        Frog frog = new Frog();
        ExerciseP140 e = new ExerciseP140();
        e.jump(frog, 5);
        e.jump(e,6);

    }
}