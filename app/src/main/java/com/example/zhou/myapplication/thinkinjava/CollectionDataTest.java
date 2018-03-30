package com.example.zhou.myapplication.thinkinjava;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Zhou
 * @Date 2018/3/30
 */

class Government implements Generator1<String> {

    String[] foundation = ("strange woman lying in ponds " + "distributing swords is no basis for a system of " + "government").split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}
public class CollectionDataTest {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 15));
//        Using the convenience method:
        set.addAll(CollectionDatas.list(new Government(), 15));
        System.out.println(set);
    }
}