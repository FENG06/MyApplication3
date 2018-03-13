package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Zhou on 2017/11/19.
 */

public class ExerciseP182 implements Readable {


    private static Random rand = new Random(47);
    private static final char[] captials = "ABCDEFG".toCharArray();
    private static final char[] lowers = "abcdefg".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;


    public ExerciseP182(int count) {
        this.count = count;
    }


    @Override
    public int read(@NonNull CharBuffer cb) throws IOException {


        if (count-- == 0) {
            return -1;
        }
        cb.append(captials[rand.nextInt(captials.length)]);

        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }

        cb.append(" ");
        return 10;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(new ExerciseP182(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}


