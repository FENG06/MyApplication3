package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise22 {

    public boolean state = false;

    void changeState(boolean state) {

        this.state = state;

    }

    @Override
    protected void finalize() throws Throwable {
        if (state) {
            System.out.println("---满的---");
            throw new Throwable("状态不为空！");
        } else {
            System.out.println("---空的---");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        new Exercise22();
        System.gc();
        System.runFinalization();

        new Exercise22().changeState(true);
        System.gc();
        System.runFinalization();
    }

}
