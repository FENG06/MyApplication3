package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/20.
 */

public class ExerciseP192 {

    private Object[] items;
    private int next = 0;

    public ExerciseP192(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }


    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }


    public Selector selector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        ExerciseP192 sequence = new ExerciseP192(10);
        for (int i = 0; i < 10; i++) {

            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}


