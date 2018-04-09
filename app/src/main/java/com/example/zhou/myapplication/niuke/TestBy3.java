package com.example.zhou.myapplication.niuke;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Zhou
 * @Date 2018/4/3
 */

public class TestBy3 {

    int count1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入左边界l: ");
        int l = sc.nextInt();

        System.out.print("请输入右边界r: ");
        int r = sc.nextInt();

        int count = 0;

        for (int i = l; i <= r; i++) {

            if (i % 3 == 0 || i % 3 == 2) {
                count++;
            }
        }
        System.out.println("可以被3整除的个数: " + count);

        Random rand = new Random(6);
        int i = rand.nextInt();

        Random rand1 = new Random(20);
        int j = rand.nextInt();


    }
}
