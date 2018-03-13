package com.example.zhou.myapplication.thinkinjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Zhou
 * @Date 2018/1/24
 */

public class ExerciseP327_1 extends ExerciseP325 {

    //    No try block needed
    @SuppressWarnings("unchecked")


    public static final List<Class<? extends APets>> allTypes =
            Collections.unmodifiableList(Arrays.asList(APets.class, Adog.class, Acat.class, Arodent.class, Amutt.class,
                    Apug.class, Aegypt.class, Amanx.class, Acymirc.class, Arat.class, Amouse.class, Ahamster.class));

//  Type for random creation:

    private static final List<Class<? extends APets>> types = allTypes.subList(allTypes.indexOf(Amutt.class), allTypes.size());

    @Override

    public List<Class<? extends APets>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}
