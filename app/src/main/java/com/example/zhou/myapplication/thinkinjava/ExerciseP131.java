package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/9.
 */

public class ExerciseP131 {

    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public ExerciseP131(String name) {
        this.name = name;
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        ExerciseP131 protector = new ExerciseP131("NSEA Protector");
        protector.forward(100);
    }

}


class SpaceShipControls {

    void up(int velocity) {
    }

    void down(int velocity) {
    }

    void left(int velocity) {
    }

    void right(int velocity) {
    }

    void forward(int velocity) {
    }

    void back(int velocity) {
    }

    void turboBoost() {
    }

}
