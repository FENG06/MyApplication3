package com.example.zhou.myapplication.debug;

/**
 * Created by Zhou on 2018/1/15.
 */

public class StackLevel {

    private int level = 1;

    public void stackLevel() {

        StringBuffer stringBuffer = new StringBuffer("");
        StringBuffer stringBuffer1 = new StringBuffer("");

        level++;
        stackLevel();
    }

    public static void main(String[] args) throws Throwable {
        StackLevel sl = new StackLevel();
        try {
            sl.stackLevel();
        } catch (StackOverflowError e) {
            System.out.println(sl.level);
        }
    }


}
