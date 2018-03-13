package com.example.zhou.myapplication.Leetcode;

/**
 * Created by Zhou on 2017/11/8.
 */

public class Test6 {
    public static boolean judgeCircle(String moves) {

        char[] chars = new char[moves.length()];
        int num = 0, count = 0;

        for (int i = 0; i < moves.length(); i++) {
            chars[i] = moves.charAt(i);
        }

        for (char aChar : chars) {
            switch (aChar) {
                case 'R':
                    num++;
                    break;
                case 'L':
                    num--;
                    break;
                case 'U':
                    count++;
                    break;
                case 'D':
                    count--;
                    break;
                default:
                    break;
            }
        }

        if (num==0&&count==0){
            System.out.println("返回原点");

            return true;
        }else {
            System.out.println("无法返回原点");
            return false;
        }

    }


    public static void main(String[] args) {
        judgeCircle("LLRRDDUU");
    }

}
