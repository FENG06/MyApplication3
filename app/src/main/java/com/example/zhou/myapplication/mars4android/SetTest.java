package com.example.zhou.myapplication.mars4android;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Zhou on 2017/12/11.
 */

public class SetTest {

    public static void main(String[] args) {


        //Iterator<--Collection<--Set<--HashSet
        //hasNext() next()

        HashSet<String> hashSet = new HashSet<>();

        Set<String> set = hashSet;

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        //调用Set对象的Iterator方法，会生成一个迭代器对象，该对象用于遍历整个Set
        Iterator<String> it = set.iterator();
        boolean b1 = it.hasNext();
        if (b1) {
            String s = it.next();
            System.out.println(s);
        }

        boolean b2 = it.hasNext();
        if (b2) {
            String s = it.next();
            System.out.println(s);
        }


        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }


        for (String s : set) {
            System.out.println(s);

        }
    }
}
