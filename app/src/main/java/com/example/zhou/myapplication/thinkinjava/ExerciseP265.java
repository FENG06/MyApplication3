package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/9.
 */

public class ExerciseP265 {


    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
//                Post-increment is zero first time:
                if (count++ == 0) {
                    throw new ThreeExecption();
                }
                System.out.println("No Exception");

            } catch (ThreeExecption threeExecption) {
                threeExecption.printStackTrace();
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause");

            }
            if (count == 2) {
                break;
            }
        }
    }

}

class ThreeExecption extends Throwable {

}