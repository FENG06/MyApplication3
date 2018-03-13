package com.example.zhou.myapplication.Leetcode;

import java.util.ArrayList;

/**
 * @author Zhou
 * @date 2017/11/1
 */

//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc


public class Test3 {

    public static void main(String[] args) {

        String s = "abc abc cba";
        Test3 test3 = new Test3();
        test3.reverseWords(s);

    }


    public String reverseWords(String s) {
        String words[] = spilt(s);
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(reverse(word) + "");
        }
        return res.toString().trim();
    }


    private String[] spilt(String s) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                words.add(word.toString());
                word = new StringBuilder();
            } else {
                word.append(s.charAt(i));
            }
        }
        words.add(word.toString());
        return words.toArray(new String[words.size()]);
    }


    private String reverse(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.insert(0, s.charAt(i));
        }
        return res.toString();
    }

}
