package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Zhou
 * @Date 2018/3/30
 */

public class ExerciseP460 {

    public static void main(String[] args) {

        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));

        System.out.println(list);

        Collections.fill(list, new StringAddress("World!"));

        System.out.println(list);
    }
}

class StringAddress {

    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}


