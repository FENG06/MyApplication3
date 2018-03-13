package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;

/**
 * Created by Zhou on 2017/12/15.
 */

public class ExerciseP218_1 {

    public static void main(String[] args) {
        ArrayList<Apple217> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Bradburn());

        for (Apple217 c : apples) {
            System.out.println(c);
        }
    }

}

class GrannySmith extends Apple217 {
}

class Gala extends Apple217 {
}

class Fuji extends Apple217 {
}

class Bradburn extends Apple217 {
}


