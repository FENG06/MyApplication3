package com.example.zhou.myapplication.thinkinjava;

/**
 * Created by Zhou on 2017/11/6.
 */

public class Exercise20 {

    public static void main(String[] args) {

        Book novel = new Book(true);
        //proper cleanup
        novel.checkIn();
        //Drop the reference,forget to clean up
        new Book(true);
        //Force garbage collection & finalization
        System.gc();

    }

}


class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
//        super.finalize();
    }
}
