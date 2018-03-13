package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/25
 */

public class ExerciseP341 extends Person341 implements Null {


    public ExerciseP341() {
        super("None", "None", "None");
    }

    @Override
    public String toString() {
        return "ExerciseP341{}";
    }
}

class Person341 {

    public final String first, last, address;

    /**
     * 空对象都是单例，所以使用静态final创建，但是因为Person不可变，所以只能在构造器设置它的值，而且无法修改（String具备内在的不可变性）。
     */

    Person341(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {

        return "Person: " + first + " " + last + " " + address ;
    }

    public static class NullPerson extends Person341 implements Null {

        private NullPerson() {
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person341 NULL = new NullPerson();
}

