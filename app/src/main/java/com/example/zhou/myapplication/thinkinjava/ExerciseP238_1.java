package com.example.zhou.myapplication.thinkinjava;

import java.util.PriorityQueue;

/**
 * Created by Zhou on 2018/1/2.
 */

public class ExerciseP238_1 {

    public static void main(String[] args) {

        PriorityQueue<Test238> test238s = new PriorityQueue<>();

//        OK to add one simple
        test238s.offer(new Test238());
//        but no more allowed;get runtime exception:
//       Test238 cannot be cast to comparable
        test238s.offer(new Test238());

    }

}

class Test238 extends Object {

}
