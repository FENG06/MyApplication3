package com.example.zhou.myapplication.thinkinjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Zhou
 * @Date 2018/1/19
 */

public class ExerciseP302 {
    static public final String POEM = "Twas brillig, and the slithy toves\n" +
            "Did gyre and gimble in the wab.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird,and shun\n" +
            "The frumious Bandersnatch.";

    public static void main(String[] args) {

//        任意数目的非空格字符（\S+）及随后的任意数目的空格字符（\s+）,目的是捕获每行的最后3个词，每行最后以$结束。

        Matcher m = Pattern.compile("(?m)(\\S+)\\s+(\\S+)\\s+(\\S+)$").matcher(POEM);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.println("group = [" + m.group() + "]");
            }
        }

    }
}
