package com.example.zhou.myapplication.thinkinjava;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP311 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner("12,42,78,99,42");
        StringTokenizer stringTokenizer = new StringTokenizer("12,32,42,42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}
