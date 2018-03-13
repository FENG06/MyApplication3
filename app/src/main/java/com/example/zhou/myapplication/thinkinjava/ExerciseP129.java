package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/8.
 */

public class ExerciseP129 extends Drawing {
    public static void main(String[] args) {
    ExerciseP129 exerciseP129 = new ExerciseP129();

    //
    new Art();
    new Drawing();
    }
}

class Work{

    public Work() {
        System.out.println("基类构造器总是会被调用，在导出类之前被调用");
    }
}


class Art extends Work{
    public Art() {
        super();
        System.out.println("Art constructor");
    }

    public Art(int i){
        System.out.println(i);
    }
}

class Drawing extends Art {
    public Drawing() {
        super();
        System.out.println("Drawing constructor");
    }
}

