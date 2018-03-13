package com.example.zhou.myapplication.thinkinjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Zhou
 * @Date 2018/1/22
 */

public class ExerciseP305 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^Java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher("java has regex\nJava has regex\n" + "JAVA has pretty good regular expression\n" +
                "Regular expression are in Java");
        while (m.find()) {
            System.out.println(m.group());
        }
    }

}
