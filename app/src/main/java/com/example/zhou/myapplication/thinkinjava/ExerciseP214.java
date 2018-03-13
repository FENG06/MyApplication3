package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/11.
 */

public class ExerciseP214 {
    private int count = 0;

    Counter getCounter(final String name) {

        class LocalCounter implements Counter {

            public LocalCounter() {
                System.out.println("LocalCounter");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        }


        return new LocalCounter();
    }


    Counter getCounter2(final String name) {
        return new Counter() {

            {
                System.out.println("Counter()");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {

        ExerciseP214 lic = new ExerciseP214();
        Counter c1 = lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(c2.next());
        }

    }

}

interface Counter {
    int next();
}

