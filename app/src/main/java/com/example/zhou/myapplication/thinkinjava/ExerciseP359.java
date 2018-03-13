package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;

import java.util.Iterator;
import java.util.Random;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP359 implements Generator1<ExerciseP358_1>, Iterable<ExerciseP358_1> {

    private Class[] types = {com.example.zhou.myapplication.thinkinjava.Latte.class, com.example.zhou.myapplication.thinkinjava.Mocha.class,
            com.example.zhou.myapplication.thinkinjava.Cappuccino.class, com.example.zhou.myapplication.thinkinjava.Americano.class, com.example.zhou.myapplication.thinkinjava.Breve.class};
    private static Random rand = new Random(47);

    public ExerciseP359() {
//       For iteration
    }

    private int size = 0;

    public ExerciseP359(int sz) {
        this.size = sz;
    }

    @Override
    public ExerciseP358_1 next() {
        try {
            return (ExerciseP358_1) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<ExerciseP358_1> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public ExerciseP358_1 next() {
            count--;
            return ExerciseP359.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


    @NonNull
    @Override
    public Iterator<ExerciseP358_1> iterator() {
        return new CoffeeIterator();
    }


    public static void main(String[] args) {

        ExerciseP359 gen = new ExerciseP359();

        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }

        for (ExerciseP358_1 c : new ExerciseP359(5)) {
            System.out.println(c);
        }
    }
}
