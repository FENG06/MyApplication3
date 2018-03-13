package com.example.zhou.myapplication.thinkinjava;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Zhou on 2017/11/20.
 */

public class ExerciseP183_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(new CharAdapter(40));
        while (s.hasNext()) {
            System.out.println(s.next());

        }


    }
}

class Mychar {

    private Random rand = new Random(100);

    public char next() {

        return (char) rand.nextInt(47);
    }
}

class CharAdapter extends Mychar implements Readable {

    private int count;

    public CharAdapter(int count) {
        this.count = count;
    }

    @Override
    public int read(@NonNull CharBuffer cb) throws IOException {

        if (count-- == 0) {
            return -1;
        }
        cb.append(next());
        return cb.length();
    }
}