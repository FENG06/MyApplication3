package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Zhou
 * @Date 2018/1/24
 */

public class ExerciseP333 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println(Part.createRandom());
        }
    }

}

class Part {

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<>();

    static {

        Collections.addAll(partFactories, new FanBelt.Factory());
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());

    }

    private static Random rand = new Random(47);

    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }

}

class Filter1 extends Part {
}

class FuelFilter extends Filter1 {
  /*
      create a class factory for each specific type
*/

    public static class Factory implements com.example.zhou.myapplication.thinkinjava.Factory<FuelFilter> {

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}


class AirFilter extends Filter1 {

    public static class Factory implements com.example.zhou.myapplication.thinkinjava.Factory<AirFilter> {

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter1 {
    public static class Factory implements com.example.zhou.myapplication.thinkinjava.Factory<CabinAirFilter> {

        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter1 {

    public static class Factory implements com.example.zhou.myapplication.thinkinjava.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {

    public static class Factory implements com.example.zhou.myapplication.thinkinjava.Factory<FanBelt> {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {

    public static class Factory implements com.example.zhou.myapplication.thinkinjava.Factory<GeneratorBelt> {

        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {

    public static class Factory implements com.example.zhou.myapplication.thinkinjava.Factory<PowerSteeringBelt> {

        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
