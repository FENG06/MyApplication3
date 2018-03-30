package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/3/23
 */

public class ExerciseP444 {

    public static int size = 10;

    public static void test(Class<?> surroundingClass) {

        for (Class<?> type : surroundingClass.getClasses()) {

            System.out.print(type.getSimpleName()+": ");

            try {

                Generator1<?> g = (Generator1<?>) type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.print(g.next() + " ");
                }
                System.out.println();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        test(ExerciseP443.class);
    }

}
