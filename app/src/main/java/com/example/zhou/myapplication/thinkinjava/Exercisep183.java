package com.example.zhou.myapplication.thinkinjava;

import java.util.Random;

/**
 * Created by Zhou on 2017/11/20.
 */

public class Exercisep183 {

    private static Random rand = new Random(47);

    public double next() {
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        Exercisep183 rd = new Exercisep183();
        for (int i = 0; i < 7; i++) {

            System.out.println(rd.next() + " ");

        }
    }
}
