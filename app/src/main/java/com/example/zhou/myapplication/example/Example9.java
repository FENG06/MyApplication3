package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/9/21.
 */


public class Example9 {

    public static void main(String[] args) {
        Example11 c = new Example11();
    }

}

class Example11 {
    static Example11 example11 = new Example11();

    public Example11() {
    System.out.println("nii");
    }
}
