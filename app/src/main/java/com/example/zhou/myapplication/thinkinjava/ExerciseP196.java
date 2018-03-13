package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP196 {

    private void internalTracking(boolean b) {

        if (b) {
            class TrackingSlip {
                private String id;

                public TrackingSlip(String s) {
                    this.id = s;
                }

                String getSlip() {
                    return id;
                }

                TrackingSlip ts = new TrackingSlip("slip");
                String s = ts.getSlip();
            }
        }

        //cant use here ,out of scope
//        TrackingSlip ts = new TrackingSlip("x");
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        ExerciseP196 p = new ExerciseP196();
        p.track();
    }
}

