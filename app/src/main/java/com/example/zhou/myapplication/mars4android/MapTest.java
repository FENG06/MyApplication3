package com.example.zhou.myapplication.mars4android;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhou on 2017/12/11.
 */

public class MapTest {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>(10);
        Map<String, String> map = hashMap;

        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("1", "f");

        int size = map.size();
        System.out.println(size);
        String a = map.get("1");
        System.out.println(a);

    }
}
