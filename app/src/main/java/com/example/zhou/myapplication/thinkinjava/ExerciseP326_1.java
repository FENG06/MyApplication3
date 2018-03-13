package com.example.zhou.myapplication.thinkinjava;

import java.util.HashMap;

/**
 * @author Zhou
 * @Date 2018/1/23
 */

public class ExerciseP326_1 {

    static class PetCounter extends HashMap<String, Integer> {

        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) {
                put(type, 1);
            } else {
                put(type, quantity + 1);
            }
        }

        public static void countPets(ExerciseP325 creator) {

            PetCounter counter = new PetCounter();
            for (APets pet : creator.createArray(20)) {

//                List each individual pet

                System.out.println(pet.getClass().getSimpleName() + " ");

                if (pet instanceof APets) {
                    counter.count("Pet");
                }

                if (pet instanceof Adog) {
                    counter.count("Dog");
                }

                if (pet instanceof Amutt) {
                    counter.count("Mutt");
                }

                if (pet instanceof Apug) {
                    counter.count("Pug");
                }

                if (pet instanceof Acat) {
                    counter.count("Cat");
                }

                if (pet instanceof Amanx) {
                    counter.count("Manx");
                }

                if (pet instanceof Acymirc) {
                    counter.count("Cymirc");
                }

                if (pet instanceof Arodent) {
                    counter.count("Rodent");
                }

                if (pet instanceof Arat) {
                    counter.count("Rat");
                }

                if (pet instanceof Amouse) {
                    counter.count("Mouse");
                }

                if (pet instanceof Ahamster) {
                    counter.count("Hamster");
                }

                System.out.println(counter);
            }
        }

        public static void main(String[] args) {
            countPets(new ExerciseP326());
        }

    }

}
