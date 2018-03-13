package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP316 {

    static void printInfo(Class cc) {
        System.out.println("Class name:" + cc.getName() + "is interface? [" +
                cc.isInterface() + "]");
        System.out.println("Simple name:" + cc.getSimpleName());
        System.out.println("Canonical name:" + cc.getCanonicalName());

    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.example.zhou.myapplication.thinkinjava.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();

        Object obj = null;
        try {
//            Require default constructor
            obj = up.newInstance();

        } catch (IllegalAccessException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (InstantiationException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }

        System.out.println(obj.getClass());
    }


}

interface HasBatteries {
}

interface WaterProof {
}

interface Shoots {
}

class Toy {
//    Comment out the following default constructor
//    to see NoSuchMethodError from(*1*)

//    Toy() {
//    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots {

    public FancyToy() {
        super(1);
    }
}

