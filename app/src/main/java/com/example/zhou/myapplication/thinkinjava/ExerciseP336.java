package com.example.zhou.myapplication.thinkinjava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author Zhou
 * @Date 2018/1/24
 */

public class ExerciseP336 {


    private static String usage = "usage:\n" + "ShowMethods qualified.class.name\n" + "To show all methods in class or:\n" + "To search for methods involving 'word'";


    private static Pattern p = Pattern.compile("\\w+\\.");


    public static void main(String[] args1) {

        String[] args = new String[]{"com.example.zhou.myapplication.thinkinjava.ExerciseP336"};

        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }

        int lines = 0;

        try {

            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length == 1) {

                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(" "));
                }

                for (Constructor ctor : ctors) {
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }

                lines = methods.length + ctors.length;
            } else {

                for (Method method : methods) {

                    if (method.toString().contains(args[1])) {

                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }

                for (Constructor ctor : ctors) {
                    if (ctor.toString().contains(args[1])) {
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                    }
                }

            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class:" + e);
        }

        ExerciseP336 e = new ExerciseP336();
    }


}
