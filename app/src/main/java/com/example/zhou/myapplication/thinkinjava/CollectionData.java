package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;

/**
 * @author Zhou
 * @Date 2018/3/26
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator1<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    // A generic convenience method:

    public static <T> CollectionData<T>
    list(Generator1
                 <T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
} ///:~
