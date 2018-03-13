package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;

/**
 * @author Zhou
 * @Date 2018/1/25
 */

public class ExerciseP343 extends ArrayList<ExerciseP342> {


    public void add(String title, Person341 person) {

        add(new ExerciseP342(title, person));
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new ExerciseP342(title));
        }
    }

    public ExerciseP343(String... titles) {
        add(titles);
    }

    public boolean positionAvailable(String title) {

        for (ExerciseP342 position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person341.NULL) {
                return true;
            }
        }
        return false;

    }

    public void fillPosition(String title, Person341 hire) {
        for (ExerciseP342 position : this) {

            if (position.getTitle().equals(title) && position.getPerson() == Person341.NULL) {
                position.setPerson(hire);
                return;
            }
//            else {
//                throw new RuntimeException("Position " + title + " not available");
//            }
        }
    }

    public static void main(String[] args) {

        ExerciseP343 staff = new ExerciseP343("President", "CTO", "Marketing Manager", "Product Manager", "Softer Engineer"
                , "Software Engineer", "Software Engineer", "Software Engineer", "Test Engineer", "Technical Writer");

        staff.fillPosition("President", new Person341("Me", "Last", "The Top,Lonely At"));


        if (staff.positionAvailable("Marketing Manager"
        )) {

            staff.fillPosition("Software Engineer", new Person341("Bob", "Coder", "Bright Light City"));

        }

        staff.fillPosition("Project Lead", new Person341("Jannet", "Planner", "The Burbs"));

        System.out.println(staff);
    }

}