package com.example.zhou.myapplication.thinkinjava;

import java.util.List;
import java.util.Map;

/**
 * @author Zhou
 * @Date 2018/2/1
 */

public class ExerciseP362 {

    static void f(Map<Person,List<? extends APets>> petPeople){}

    public static void main(String[] args) {
//    类型参数避免了重复的泛型参数列表
        Map<Person, List<? extends APets>> petPeople = New.map();
//        f(New.map());
    }
}
