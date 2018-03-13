package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/8.
 */

public class ExerciseP126 {


    private String //在定义对象的的地方初始化
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;


    public ExerciseP126() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
        System.out.println("运行顺序标记2");
    }


//    实例初始化

    {
        i = 47;
        System.out.println("运行顺序标记1");
    }


    @Override
    public String toString() {
        if (s4 == null) {
            //惰性初始化
            s4 = "Joy";
        }

        System.out.println("运行顺序标记3");

        return "ExerciseP126{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        ExerciseP126 e = new ExerciseP126();
        System.out.println(e);
    }


}


class Soap {

    private String s;

    public Soap() {
        System.out.println("Soap()");
        s = "Constructed";

        System.out.println("运行顺序标记4");

    }

    @Override
    public String toString() {

        System.out.println("运行顺序标记5");

        return "Soap{" +
                "s='" + s + '\'' +
                '}';
    }
}