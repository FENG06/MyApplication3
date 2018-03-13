package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by Zhou on 2017/11/20.
 */

public class ExerciseP183_1 extends Exercisep183 implements Readable {


    private int count;

    public ExerciseP183_1(int count) {
        this.count = count;
    }

    @Override
    public int read(@NonNull CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }

        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(new ExerciseP183_1(7));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble() + " ");
        }

    }
}
