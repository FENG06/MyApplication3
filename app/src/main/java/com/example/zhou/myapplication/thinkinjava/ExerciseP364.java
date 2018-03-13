package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP364 {

    public static <T> Collection<T> fill(Collection<T> coll, Generator1<T> gen, int n) {

        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<ExerciseP358_1> coffee = fill(new ArrayList<ExerciseP358_1>(), new ExerciseP359(), 4);
        for (ExerciseP358_1 c : coffee) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new ExerciseP360(), 12);
        for (int i : fnumbers) {
            System.out.print(i + ",");
        }
    }
}

