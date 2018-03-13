package com.example.zhou.myapplication.thinkinjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Zhou
 * @Date 2018/1/19
 */

public class ExerciseP301 {

    public static void main(String[] args) {

        args = new String[]{"Java now has regular expression"};

        String[] s = new String[]{"^Java", "\breg.*", "s?", "s*", "s+", "s{4}", "s{1}", "s{0,3}"};

        for (String arg : s) {

            Pattern p = Pattern.compile(arg);

            Matcher m = p.matcher(args[0]);

            if (!m.find()) {
                System.out.println(("No match found for " + "\"" + arg + "\""));
            }
            m.reset();
            while (m.find()) {
                System.out.println(("Match \"" + m.group() + "\" at position " +
                        m.start() + ((m.end() - m.start() < 2) ? "" : ("-" + (m.end() - 1)))));
            }

//            while (m.find()) {
//
//                System.out.println(m.group()+ " matches at " + m.start() + "-" + (m.end() - 1));
//
//            }
        }
    }

}
