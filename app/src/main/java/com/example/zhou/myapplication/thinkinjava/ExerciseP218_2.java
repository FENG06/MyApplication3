package com.example.zhou.myapplication.thinkinjava;

import java.util.ArrayList;

/**
 * Created by Zhou on 2017/12/15.
 */

public class ExerciseP218_2 {

    public static void main(String[] args) {

        ArrayList<Gerbil> gerbils = new ArrayList<>();

        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));
        gerbils.add(new Gerbil(4));


        for (int i = 0; i < gerbils.size(); i++) {
            System.out.println(gerbils.get(i));
            gerbils.get(i).hop();
        }
    }

}

class Gerbil {

    int hernilNubmber;

    public Gerbil(int hernilNubmber) {
        this.hernilNubmber = hernilNubmber;
    }


    void hop() {

        System.out.println(hernilNubmber + "正在跳跃");
    }
}
