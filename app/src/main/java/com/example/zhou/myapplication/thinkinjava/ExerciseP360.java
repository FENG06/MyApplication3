package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP360 implements Generator1<Integer> {

    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static void main(String[] args) {
        ExerciseP360 gen = new ExerciseP360();
        for (int i = 0; i < 18; i++) {
            System.out.print(gen.next() + " ");
        }
    }
}
