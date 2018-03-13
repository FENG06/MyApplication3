package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP322 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class<FancyToy> ftClass = FancyToy.class;
//        Produce exact type
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();

        /**
         * 编译器在编译期就知道所编译的对象是什么类型的，在本类中就是Toy.class，而不仅仅只是"某个类，他是FancyToy超类"
         * */
//        This won’t compile Class<Toy> up2 = ftClass.getSuperclass(); Only produce object
        Object object = up.newInstance();
    }
}
