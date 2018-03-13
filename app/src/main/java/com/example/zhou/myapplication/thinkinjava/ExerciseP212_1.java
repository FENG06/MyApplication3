package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/11.
 */

public class ExerciseP212_1 {

    class InnerClass2 extends OuterClass.InnerClass {

        public InnerClass2(OuterClass i) {
            i.super(10);

        }
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();
        ExerciseP212_1 e = new ExerciseP212_1();
        InnerClass2 in2 = e.new InnerClass2(out);
    }
}


class OuterClass {

    class InnerClass {

        int i;

        public InnerClass(int i) {
            this.i = i;
        }

        public InnerClass() {
        }
    }

}
