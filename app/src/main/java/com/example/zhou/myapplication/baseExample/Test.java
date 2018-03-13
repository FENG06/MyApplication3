package com.example.zhou.myapplication.baseExample;


import com.example.zhou.myapplication.thinkinjava.Exercise2;

import static com.example.zhou.myapplication.baseExample.Print.print;
import static com.example.zhou.myapplication.baseExample.Print.printf;
import static com.example.zhou.myapplication.baseExample.Print.printnb;

/**
 * Created by Zhou on 2017/11/8.
 */

public class Test {


    public static void main(String[] args) {

        Exercise2 exercise2 = new Exercise2();

        print(1);
        print("Available from now on");
        printf("test",3.14159);
        printnb('a');

    }

}
