package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhou
 * @Date 2018/3/22
 */

public class ExerciseP435 {

    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }

        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);

        List<BerylliumSphere> sphereList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            sphereList.add(new BerylliumSphere());
        }

        System.out.println(sphereList);
        System.out.println(sphereList.get(4));

        int[] integers = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);

        List<Integer> integerList = new ArrayList<>( Arrays.asList(0, 1, 2, 3, 4, 5));
        integerList.add(97);
        System.out.println(integerList);
        System.out.println(integerList.get(4));
    }

}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere" + id;
    }
}