package com.example.zhou.myapplication.thinkinjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Zhou
 * @Date 2018/1/22
 */

public class ExerciseP307 {

//    avoid use pattern in method body

    public static Pattern p = Pattern.compile("[tfrb][aeihu][edgx]");

    public static void main(String[] args) {

        Matcher m = p.matcher("fix the rug with bags");

        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        m.reset("fix the rug with bags");

        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        m.reset("the fixed rug");

        while (m.find()) {
            System.out.print(m.group() + " ");
        }

        m.reset();
//使用不带参数的reset()方法，可以将Matcher对象重新设置到当前字符序列的起始位置
        System.out.println();

        while (m.find()) {
            System.out.print(m.group() + " ");
        }

    }

}
