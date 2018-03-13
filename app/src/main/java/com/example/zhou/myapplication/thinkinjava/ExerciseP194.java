package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP194 {

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c  = p.contents();
        Desination d = p.desination("Tasmania");

    }

}


interface Desination {
    String readLabel();
}

interface Contents {
    int value();
}

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Desination {

        private String label;

        public PDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Desination desination(String s) {
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContents();
    }
}


