package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise19 {


    public Exercise19 met() {
        miss(new Exercise19());
        miss(this);
        return this;
    }

    public void miss(Exercise19 exercise19) {
        System.out.println("测试一下");
    }


    public void getApple(){
        System.out.print("未使用this调用：");
        createApple();
        System.out.print("使用this调用：");
        this.createApple();
    }

    public void createApple(){
        System.out.println("已创建好……");
    }

    public static void main(String[] args) {
        Exercise19 exercise19 = new Exercise19();
        exercise19.met();
        exercise19.getApple();


    }


}
