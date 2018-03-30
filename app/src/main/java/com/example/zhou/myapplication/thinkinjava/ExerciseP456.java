package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;

/**
 * @author Zhou
 * @Date 2018/3/26
 */

public class ExerciseP456 {
    public static void main(String[] args) {
        Generator1<Integer> gen = new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        while (true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                System.out.println("Location of " + r + " is " + location + ", a[" + location + "] = " + a[location]);
                break;
            }
        }


        int[] b = {1, 5, 2, 7, 3, 4};

        System.out.println("插入点的位置：" + -(Arrays.binarySearch(b, 10) + 1));

        Arrays.sort(b);

        System.out.println("插入点的位置：" + -(Arrays.binarySearch(b, 6) + 1));

    }

//    public RandomGenerator.String getSecond() {}
//    public Object getSecond(){}
}
