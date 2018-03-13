package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP365BasicDemo {
    public static void main(String[] args) {
        Generator1<ExerciseP365CountedObject> gen = ExerciseP365BasicGenerator.create(ExerciseP365CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
