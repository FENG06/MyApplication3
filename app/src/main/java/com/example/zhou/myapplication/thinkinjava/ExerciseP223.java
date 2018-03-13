package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by Zhou on 2017/12/25.
 */

public class ExerciseP223 {


    public static void main(String[] args) {
//        Producer producer = new Producer();
//        ArrayList<Producer> arrayList = new ArrayList<>();
//        System.out.println(arrayList);
//        LinkedList<Producer> linkedList = new LinkedList<>();
//        System.out.println(linkedList);
//------分割线----------

        Generator gen = new Generator();
        String[] a = new String[10];
        gen.fillA(a);

//        for (String s : a) {
//            System.out.println(s + ",");
//        }
//
//        System.out.println();

        System.out.println(gen.fill(new ArrayList<String>(), 10));
        System.out.println(gen.fill(new LinkedList<String>(), 10));
        System.out.println(gen.fill(new HashSet<String>(), 10));
        System.out.println(gen.fill(new LinkedHashSet<String>(), 10));
        System.out.println(gen.fill(new TreeSet<String>(), 10));

    }


}


class Producer {

    static String next(String[] movie) {

        movie = new String[]{"Snow White", "White", "Star Wars"};

        String output = null;

        int count = 0;


        for (String names : movie) {

            output = names;
            count++;

            if (count == movie.length) {
                count = 0;
            }
        }

        return output;

    }


}

class Generator {

    int key = 0;

    public String next() {

        switch (key) {
            case 0:
                key++;
                return "Snow white";
            case 1:
                key++;
                return "Bashful";
            case 2:
                key++;
                return "Doc";
            case 3:
                key++;
                return "Dopey";
            case 4:
                key++;
                return "Grumpy";
            case 5:
                key++;
                return "Happy";
            case 6:
                key++;
                return "Sleepy";
            default:
        }
        return null;
    }

    void fillA(String[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = next();
        }
    }

    Collection fill(Collection<String> c, int n) {

        for (int i = 0; i < n; i++) {
            c.add(next());
        }
        return c;
    }
}