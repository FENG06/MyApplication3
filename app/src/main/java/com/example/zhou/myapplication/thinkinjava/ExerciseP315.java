package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP315 {

    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            System.out.println("----测试---");
            Class.forName("Gum");
            Class.forName("com.example.zhou.myapplication.thinkinjava.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating cookie");
    }


}


class Candy {
    static {
        System.out.println("Loading candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {

    static {
        System.out.println("Loading Cookie");
    }
}