package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/20.
 */

public class ExerciseP188_1 {


    public static void getCycleFactory(CycleFactory cycleFactory) {
        Cycle c = cycleFactory.getCycle();
        c.ride();
    }


    public static void main(String[] args) {

        getCycleFactory(new BicycleFactory());
        getCycleFactory(new UnicycleFactory());

    }

}



interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Unicycle ride()");
    }
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Biycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Bicycle ride()");
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Biycle();
    }
}
