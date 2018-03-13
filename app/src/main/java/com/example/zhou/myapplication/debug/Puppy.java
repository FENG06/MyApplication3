package com.example.zhou.myapplication.debug;

/**
 * Created by Zhou on 2017/11/8.
 */

public class Puppy extends Dog {

    @Override
    public void name(String s) {
        super.name(s);
    }

    @Override
    public void run(String s) {
        super.run(s);
    }

    @Override
    protected void shout(String s) {
        super.shout(s);
    }

    @Override
    void leg(int i) {
        super.leg(i);
    }
}


class Homer {

    char doh(char c) {
        return 'd';
    }

    float doh(float f) {
        return 1.0f;
    }
}

class Milhouse {
}

class Bart extends Homer {
    void doh(Milhouse m) {

    }
}