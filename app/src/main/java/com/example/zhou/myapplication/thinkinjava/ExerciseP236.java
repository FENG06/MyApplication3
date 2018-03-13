package com.example.zhou.myapplication.thinkinjava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Zhou on 2018/1/2.
 */

public class ExerciseP236 {

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }

    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i+10));
            printQ(queue);
        }
        System.out.println();

        Queue<Character> qc = new LinkedList<>();
        for (Character c :"Brontosaurus".toCharArray()) {

            qc.offer(c);
            printQ(qc);
        }

    }

}
