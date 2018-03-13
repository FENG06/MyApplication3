package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/23.
 */

public class Example25 {

    public static void main(String[] args) {
        Example25 example25 = new Example25();
        example25.first();
    }

    private void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }

    private void second(Value v, int i) {

        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i+""+i);

    }


}

class Value {
    public int i = 15;

}
