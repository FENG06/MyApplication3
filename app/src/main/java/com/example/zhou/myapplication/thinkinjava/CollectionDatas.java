package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;

/**
 * @author Zhou
 * @Date 2018/3/30
 */

public class CollectionDatas<T> extends ArrayList<T> {

    public CollectionDatas(Generator1<T> gen, int quantity) {

        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

//    A generic convenience method:

    public static <T> CollectionDatas<T> list(Generator1<T> gen, int quantity) {

        return new CollectionDatas<>(gen, quantity);
    }
}
