package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/8.
 */

public class ExerciseP255 {
    public static void f() throws MyException2 {
        System.out.println("MyException2 f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("MyException2 g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        System.out.println("MyException2 h()");
        throw new MyException2("Originated in h()", 47);
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
        try {
            h();
        } catch (MyException2 myException2) {
            System.out.println("e.val()=" + myException2.val());
        } catch (Exception e) {
//        通过捕获异常类型的基类Exception，来捕获所有类型的异常，最好将其放在处理程序列表的末尾
            System.out.println("Catch an Exception");
        }

    }


}

class MyException2 extends Exception {
    private int x;

    public MyException2(int x) {
        this.x = x;
    }

    public MyException2(String message) {
        super(message);
    }

    public MyException2(String message, int x) {
        super(message);
        this.x = x;
    }

    public MyException2() {
    }

    public int val() {
        return x;
    }


    @Override
    public String getMessage() {

        return "Detail Message" + x + " " + super.getMessage();
    }

}