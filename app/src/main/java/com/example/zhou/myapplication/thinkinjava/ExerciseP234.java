package com.example.zhou.myapplication.thinkinjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Zhou on 2017/12/26.
 */

public class ExerciseP234 {

    public static void main(String[] args) {

        ExerciseP234 e = new ExerciseP234();

        Map<Integer, Integer> m20 = new TreeMap<>();
        for (int i = 0; i < 2000; i++) {

            int x = e.getBestInt20(10000);
            Integer freq = m20.get(x);
            m20.put(x, freq == null ? 1 : freq + 1);
        }

        System.out.println("Most often picked ints,0-19,in 2000 tests of 10000 random picks:" + m20);


    }

    private int getBestInt20(int n) {

        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < 10000; i++) {

            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);

        }

        int max = 0;

        for (int i = 0; i < m.keySet().size(); i++) {

            max = max < m.get(i) ? m.get(i) : max;
        }

        Set<Map.Entry<Integer, Integer>> me = new LinkedHashSet<>();
        int maxKey = 0;
        Iterator<Map.Entry<Integer, Integer>> it = me.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Integer> findMax = it.next();
            if (findMax.getValue() == max) {
                maxKey = findMax.getKey();
            }
        }

        System.out.println(m);

        return maxKey;
    }


}
