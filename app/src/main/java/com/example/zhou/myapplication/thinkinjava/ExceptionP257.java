package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2018/1/8.
 */

public class ExceptionP257 {

    public static void f(int x) throws ExceptionA, ExceptionB, ExceptionC {

        if (x < 0) {
            throw new ExceptionA("x<0");
        }
        if (x == 0) {
            throw new ExceptionB("x==0");
        }
        if (x > 0) {
            throw new ExceptionA("x>0");
        }
    }


    public static void main(String[] args) {
        try {
            f(1);
            f(0);
            f(-1);
        } catch (ExceptionC exceptionC) {
            exceptionC.printStackTrace();
        } catch (ExceptionB exceptionB) {
            exceptionB.printStackTrace();
        } catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        } catch (Exception e) {
            System.out.println("Catch Exception");
            e.printStackTrace(System.out);
        }
    }

}

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends Exception {
    public ExceptionB(String message) {
        super(message);
    }
}

class ExceptionC extends Exception {
    public ExceptionC(String message) {
        super(message);
    }
}
