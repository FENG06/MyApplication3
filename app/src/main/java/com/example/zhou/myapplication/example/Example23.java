package com.example.zhou.myapplication.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Zhou on 2017/10/20.
 */

public class Example23 {


    public static void main(String[] args) {
        System.out.println("请输入电话号码：");
        Scanner scanner = new Scanner(System.in);
        String sr = scanner.nextLine();

        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的年龄：");
        String age = scanner.next();

        System.out.println("请输入你的工资：");
        float salary = scanner.nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名：" + name + "\n" + "年龄：" + age + "\n" + "工资：" + salary);


        isMobile isMobile = new isMobile();

        if (!isMobile.JudgeTel1(sr)) {
            System.out.println("号码格式有误");
        } else {

            System.out.println("你输入电话号码正确");
        }


        if (!isMobile.JudgeTel2(sr)) {
            System.out.println("号码格式1有误");
        } else {

            System.out.println("你输入电话号码2正确");
        }


    }

    static class isMobile {

        private boolean JudgeTel1(String s) {
            String userTel = s;
//
//            int a[][] = new int[][];
//            int b[ 10][10]=new int[][];
            int [][]c = new int[10][10];
            int[] d[] = new int[10][10];


            String[] nk = new String[]{"130", "131", "132", "133", "134", "135",
                    "136", "137", "138", "139", "150", "151", "152", "153", "154",
                    "155", "156", "157", "158", "159", "170", "180", "181", "182",
                    "183", "184", "185", "186", "187", "188", "189"};
            if (userTel.length() == 11) {
                String num = userTel.substring(0, 3);
                int i;
                for (i = 0; i < nk.length; i++)
                    if (nk[i].equals(num))
                        break;
                if (i < nk.length) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public boolean JudgeTel2(String s) {
            String reg = "^[1][3,4,5,8][0-9]{9}$";
            Pattern p = null;
            Matcher m = null;
            boolean b = false;
            p = Pattern.compile(reg);
            m = p.matcher(s);
            b = m.matches();
            return b;
        }
    }
}

