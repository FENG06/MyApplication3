package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/13.
 */

public class ExerciseP161  {

    public static void main(String[] args) throws Throwable {
        Shared shared = new Shared();
        Composing[] composings = new Composing[]{new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing c : composings) {
            c.dispose();
            c.finalize();
        }
        System.gc();
    }
}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    private final long id1 = 5;


    public Shared() {
        System.out.println("Creating " + this);
    }


    public void addRef() {
        refcount++;
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        if (--refcount != 0) {
            return;
        } else {
            super.finalize();
        }
    }

    public int getRefcount() {
        return refcount;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }


    @Override
    protected void finalize() throws Throwable {
        if (shared.getRefcount() != 0) {
            System.out.println("can not finalize now");
        } else {
            System.out.println("finalize now");
            super.finalize();
        }
    }
}
