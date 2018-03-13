package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP365BasicGenerator<T> implements Generator1<T> {

    private Class<T> type;

    public ExerciseP365BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
//            Assumes type is a public class
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

//    Produce a Default generator given a type token:

    public static <T> Generator1<T> create(Class<T> type) {
        return new ExerciseP365BasicGenerator<>(type);
    }
}
