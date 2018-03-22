package com.example.zhou.myapplication.thinkinjava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author Zhou
 * @Date 2018/3/22
 */

public class ExerciseP369 {


    public static void serve(Teller t, Customer c) {
        System.out.println(t + "serves" + c);
    }


    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<>();
//        Generators.fill
    }
}


class Customer {
    private static long counter = 1;
    private final long id = counter++;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer" + id;
    }

    public static Generator1<Customer> generator() {
        return new Generator1<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static long counter = 1;
    private final long id = counter++;

    public Teller() {
    }

    @Override
    public String toString() {
        return "Teller" + id;
    }

    public static Generator1<Teller> generator = new Generator1<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };
}
