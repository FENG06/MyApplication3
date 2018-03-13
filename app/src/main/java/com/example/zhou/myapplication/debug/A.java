package com.example.zhou.myapplication.debug;

/**
 * Created by Zhou on 2017/11/12.
 */


public class A {
    boolean show(char a) {
        System.out.println(a);
        return true;
    }
}

class Demo extends A {
    @Override
    boolean show(char a) {
        System.out.println(a);
        return false;
    }

    public static void main(String[] args) {
        int i = 0;
        A a = new Demo();
        Demo d = new Demo();
        for (a.show('A'); a.show('B') && i < 'Z'; d.show('C')) {
            i++;
            d.show('D');
        }

        Object[][] fields;

        fields = new Object[3][2];
        for (int j = 0; j < 3; j++) {
            fields[j] = new Object[]{null, null};
            System.out.println(fields[j].toString());
        }
    }
}