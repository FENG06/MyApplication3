package com.example.zhou.myapplication.debug;

/**
 * Created by Zhou on 2017/12/6.
 */

public class Test13 {

    public static void main(String[] args) throws Exception {

        double test = 4;
        System.out.println(sqrt(2));

    }


    public static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }

        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }


}
