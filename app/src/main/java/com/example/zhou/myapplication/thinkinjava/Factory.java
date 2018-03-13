package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/24
 */

public interface Factory<T> {

    /**
     * @return 泛型参数T使得create()可以在每种Factory实现中返回不同的类型。
     */
    T create();

}
