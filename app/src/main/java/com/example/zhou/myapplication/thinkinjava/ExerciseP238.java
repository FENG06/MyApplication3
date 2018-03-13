package com.example.zhou.myapplication.thinkinjava;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by Zhou on 2018/1/2.
 */

public class ExerciseP238 {


    public static void main(String[] args) {


        PriorityQueue<Double> pd = new PriorityQueue<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

            pd.offer(rand.nextDouble() + i);
        }


        while (pd.peek() != null) {

            System.out.println(pd.poll());

        }
    }

}
