package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhou
 * @Date 2018/3/22
 */

public class ExerciseP441 {

    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = la;

        ls[0] = new ArrayList<>();

//        Compile-time checking produces an error:
//        ls[1] = new ArrayList<Integer>();

        Object[] objects = ls;
//        Compiles and runs without complaint:
        objects[1] = new ArrayList<Integer>();


//        However,if your needs are straightforward it is
//        possible to create an array of generics,albeit
//        with an "unchecked" warning:

        List<BerylliumSphere>[] spheres = new List[10];
        for (int i = 0; i <spheres.length ; i++) {
            spheres[i] = new ArrayList<>();
        }
    }
}
