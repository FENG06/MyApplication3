package com.example.zhou.myapplication.mars4android;

/**
 * Created by Zhou on 2017/12/7.
 */

public class Test2 {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Test2)) {
            return false;
        } else {

            Test2 t = (Test2) obj;

        }

        return false;
    }


    public static void main(String[] args) {

        Service service = new Service();
        Thread t1 = new Thread(new MyThread1(service));
        Thread t2 = new Thread(new MyThread2(service));

        t1.start();
        t2.start();

        boolean b1 = t1.equals(t2);
        System.out.println(b1);


    }


    class TestOuter {

        public int i;

        void run() {

            final int a = 10;


            class MethodTestInner {

                private void run() {
                    System.out.println(a);
                }

            }
        }

        private class TestInner {


        }

    }

}
