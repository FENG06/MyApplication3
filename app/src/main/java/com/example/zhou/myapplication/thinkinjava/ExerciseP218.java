package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;

/**
 * Created by Zhou on 2017/12/15.
 */

public class ExerciseP218 {
    public static void main(String[] args) {
        ArrayList<Apple217> apples = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            apples.add(new Apple217());
        }


        for (int j = 0; j < apples.size(); j++) {
            System.out.println(apples.get(j).id());
        }

        for (Apple217 apple : apples) {
            System.out.println(apple.id());

        }
    }
}
