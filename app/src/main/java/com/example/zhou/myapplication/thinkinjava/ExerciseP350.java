package com.example.zhou.myapplication.thinkinjava;

import java.lang.reflect.Field;

/**
 * @author Zhou
 * @Date 2018/1/29
 */

public class ExerciseP350 {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        WithPrivateFinalField pf = new WithPrivateFinalField();
        System.out.println(pf);
        Field f = pf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println("f.getInt(pf):" + f.getInt(pf));
        f.setInt(pf, 47);
        System.out.println(pf);
        f = pf.getClass().getDeclaredField("s");
        f.setAccessible(true);
        System.out.println("f.get(pf):" + f.get(pf));
        f.set(pf, "No, you're not!");
        System.out.println(pf);
        f = pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f.get(pf):" + f.get(pf));
        f.set(pf, "No, you're not!");
        System.out.println(pf);

    }

}

class WithPrivateFinalField {
    private int i = 1;
    private final String s = "I'm totally safe";
    private String s2 = "Am I safe?";

    @Override
    public String toString() {
        return "WithPrivateFinalField{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}
