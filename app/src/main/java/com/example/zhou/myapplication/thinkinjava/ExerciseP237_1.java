package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/**
 * Created by Zhou on 2018/1/2.
 */

public class ExerciseP237_1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {

            priorityQueue.offer(rand.nextInt(i + 10));

        }

        ExerciseP236.printQ(priorityQueue);
        System.out.println();

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3,
                9, 14, 1, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        ExerciseP236.printQ(priorityQueue);
        System.out.println();

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.<Integer>reverseOrder());
        priorityQueue.addAll(ints);
        ExerciseP236.printQ(priorityQueue);
        System.out.println();

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringsPQ = new PriorityQueue<>(strings);
        ExerciseP236.printQ(stringsPQ);
        System.out.println();

        stringsPQ = new PriorityQueue<>(strings.size(), Collections.<String>reverseOrder());
        stringsPQ.addAll(strings);
        ExerciseP236.printQ(stringsPQ);
        System.out.println();

        Set<Character> charSet = new HashSet<>();
        for (char c : fact.toCharArray()) {
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        ExerciseP236.printQ(characterPQ);
        System.out.println();

    }
}
