package com.example.zhou.myapplication.thinkinjava;

import com.example.zhou.myapplication.debug.Stack;

/**
 * Created by Zhou on 2017/12/26.
 */

public class ExerciseP230 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        for (String s : "My dog has fleas".split(" ")) {

            stack.push(s);


//            while (!stack.empty()) {
//
//                System.out.println(stack.pop() + " ");
//            }

        }

        while (!stack.empty()) {

            System.out.println(stack.pop() + " ");
        }

    }
}

