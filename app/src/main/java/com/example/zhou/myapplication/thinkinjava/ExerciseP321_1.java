package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP321_1<T> {

    /**
     * 存储了一个类引用，稍后又产生一个List，填充这个List的对象使用newInstance()方法
     */
    private Class<T> type;

    private ExerciseP321_1(Class<T> type) {
        this.type = type;
    }

    private List<T> crete(int nElements) {
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return result;
    }

    public static void main(String[] args) {

        ExerciseP321_1<CountedInteger> fl = new ExerciseP321_1<>(CountedInteger.class);
        System.out.println(fl.crete(16));
    }


}

class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}