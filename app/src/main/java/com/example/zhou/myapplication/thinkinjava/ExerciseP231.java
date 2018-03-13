package com.example.zhou.myapplication.thinkinjava;

import com.example.zhou.myapplication.debug.Stack;

/**
 * Created by Zhou on 2017/12/26.
 */

public class ExerciseP231 {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
//        定义一个String类型，并初始化

        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";


        int pluscount = 0;
        int minucount = 0;


        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            switch (c) {
                case '+':

//                    stack.push(str.charAt(i + 1));
//                    i++;
                    pluscount++;
                    break;

                case '-':

                    minucount++;
//                    System.out.println("栈顶元素是" + stack.pop());
                    break;

                default:
            }
        }




        System.out.println("最后栈情况:" + stack);
    }

}
