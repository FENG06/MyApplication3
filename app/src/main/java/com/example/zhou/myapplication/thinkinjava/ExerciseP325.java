package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public abstract class ExerciseP325 {

    private Random rand = new Random(47);

    /**
     * @return The list of the different types of pet to create
     */
    public abstract List<Class<? extends APets>> types();

    public APets randowPet() {

        int n = rand.nextInt(types().size());

        try {
            return types().get(n).newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        }
    }

    public APets[] createArray(int size) {
        APets[] result = new APets[size];
        for (int i = 0; i < size; i++) {
            result[i] = randowPet();
        }
        return result;
    }

    public ArrayList<APets> arrayList(int size) {
        ArrayList<APets> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
