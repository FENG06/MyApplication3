package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/17.
 */

public class ExerciseP166 {


    public static void main(String[] args) {

        AlertStatus alertStatus = new AlertStatus();
        alertStatus.getShipstatus();
        alertStatus.changeShip();
        alertStatus.getShipstatus();
    }
}


class Starship {
    public void launch() {
    }
}

class Warship extends Starship {
    @Override
    public void launch() {
        System.out.println("Warship.launch()");
    }
}

class Landship extends Starship {
    @Override
    public void launch() {
        System.out.println("Landship.launch()");
    }
}

class AlertStatus {

    private Starship warship = new Warship();

    void changeShip() {
        warship = new Landship();
    }

    void getShipstatus() {
        warship.launch();
    }
}




