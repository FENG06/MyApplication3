package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/3/26
 */
public class Generated {
    // Fill an existing array:
    public static <T> T[] array(T[] a, Generator1<T> gen) {
        return new CollectionData<T>(gen, a.length).toArray(a);
    }

    // Create a new array:
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type,
                                Generator1<T> gen, int size) {
        T[] a =
                (T[]) java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<T>(gen, size).toArray(a);
    }
} ///:~

