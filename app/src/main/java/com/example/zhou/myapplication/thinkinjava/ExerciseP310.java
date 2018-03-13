package com.example.zhou.myapplication.thinkinjava;

import java.util.Scanner;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP310 {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(ExerciseP309.input);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old are you?And what is your favorite double?");
        System.out.println("(stdin:<age><double>)");
        String numbers = stdin.nextLine();
        System.out.println(numbers);
        String[] numArray = numbers.split(" ");
        int age = Integer.parseInt(numArray[0]);
        double favorite = Double.parseDouble(numArray[1]);
        System.out.printf("Hi %s.\n", name);
        System.out.printf("In 5 years you will be %d.\n", age + 5);
        System.out.printf("My favorite double is %f.", favorite / 2);

    }

}
