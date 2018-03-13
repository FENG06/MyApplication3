package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/9.
 */

public class ExerciseP133 extends Custom {


    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;


    public ExerciseP133(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {

        ExerciseP133 exerciseP133 = new ExerciseP133(9);

    }


}


//Combining composition & inheritance

class Plate {
    public Plate(int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate {

    public DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil {

    public Utensil(int i) {
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil {

    public Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil {
    public Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}


class Knife extends Utensil {
    public Knife(int i) {
        super(i);
        System.out.println("Knife constructor");

    }
}

//A cultural way of doing something

class Custom {
    public Custom(int i) {
        System.out.println("Custom constructor");
    }
}