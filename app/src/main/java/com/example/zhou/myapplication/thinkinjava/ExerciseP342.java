package com.example.zhou.myapplication.thinkinjava;

/**
 * @author Zhou
 * @Date 2018/1/25
 */

public class ExerciseP342 {

    private String title;
    private Person341 person;

    public ExerciseP342(String jobTitle, Person341 employee) {

        title = jobTitle;
        person = employee;

        if (person == null) {

            person = Person341.NULL;

        }

    }

    public ExerciseP342(String jobTitle) {

        this.title = jobTitle;
        person = Person341.NULL;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }


    public Person341 getPerson() {
        return person;
    }

    public void setPerson(Person341 newPerson) {
        person = newPerson;

        if (person == null) {

            person = Person341.NULL;
        }
    }

    @Override
    public String toString() {
        return "Position: " + title + " "+ person;
    }
}
