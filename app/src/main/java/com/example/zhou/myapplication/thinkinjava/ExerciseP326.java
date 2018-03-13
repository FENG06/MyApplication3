package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP326 extends ExerciseP325 {

    private static List<Class<? extends APets>> types = new ArrayList<Class<? extends APets>>();

//    Types that you want to be randomly created

    private static String[] typeNames = {"com.example.zhou.myapplication.thinkinjava.Amutt", "com.example.zhou.myapplication.thinkinjava.Apug",
            "com.example.zhou.myapplication.thinkinjava.Aegypt", "com.example.zhou.myapplication.thinkinjava.Amanx",
            "com.example.zhou.myapplication.thinkinjava.Acymirc", "com.example.zhou.myapplication.thinkinjava.Arat",
            "com.example.zhou.myapplication.thinkinjava.Amouse", "com.example.zhou.myapplication.thinkinjava.Ahamster"};

    @SuppressWarnings("unchecked")

    public static void loader() {

        try {
            for (String name : typeNames) {
                types.add((Class<? extends APets>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 注解不能直接置于静态初始化语句之上
     * */
    static {
        loader();
    }

    @Override
    public List<Class<? extends APets>> types() {
        return types;
    }
}
