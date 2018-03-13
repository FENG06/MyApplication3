package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/9.
 */

public class ExerciseP132 {
    public static void main(String[] args) {
        CleanserDelegation cleanserDelegation = new CleanserDelegation();
        cleanserDelegation.append("c");
    }

}



class CleanserDelegation{


    Cleanser1 cleanser1 = new Cleanser1();
    public CleanserDelegation() {
    }

    public void append(String a) {
        cleanser1.append(a);
    }

    public void dilute() {
        cleanser1.dilute();
    }

    public void apply() {
        cleanser1.apply();
    }

    public void scrub() {
        cleanser1.scrub();
    }

    public static void main(String[] args) {
        Cleanser1.main(args);
    }
}






 class Cleanser1 {
    private String s = "Cleanser";

    public void append(String a) {
        //“+=”将几个String对象连接成s
        s += a +" ";
    }

    public void dilute() {
        append("dilute()");
    }

    public void apply() {
        append("apply()");
    }

    public void scrub() {
        append("scrub()");
    }

    @Override
    public String toString() {
        return s;
    }


    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
