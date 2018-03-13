package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/12/6.
 */

public class ExerciseP195 {


    public static void main(String[] args) {
        ExerciseP195Test e = new ExerciseP195Test();
        e.invokeInner();
        ExerciseP195Test.Inner195 in = new ExerciseP195Test.Inner195();
        in.changeField(11);
    }

}


class ExerciseP195Test {

    private int a = 10;

    private void f() {

        System.out.println("测试一下");
    }


    public static void test() {
        Inner195 inner195 = new Inner195();
        System.out.println(inner195.innerValue);
    }

    static class Inner195 {
        private int innerValue = 10;

        ExerciseP195Test changeField(int i) {
            ExerciseP195Test e = new ExerciseP195Test();
            e.a = i;
//            ExerciseP195Test.this.a = i;
            e.f();
            return new ExerciseP195Test();
        }
    }


    public void invokeInner() {
        Inner195 in = new Inner195();
        in.changeField(100);
    }


    public ExerciseP191.Destination destination(String s) {
        class PDestination implements Desination {

            private String label;

            private PDestination(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return null;
            }
        }


        return new ExerciseP191.Destination(s);
    }



}