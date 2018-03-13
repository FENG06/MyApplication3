package com.example.zhou.myapplication.example;

/**
 *
 * @author Zhou
 * @date 2017/10/24
 */

public class VarArgsTest {
    public static void main(String[] args) {
        BaseVarArgs baseVarArgs = new SubVarArgs();
        baseVarArgs.print("hello");


        SubVarArgs subVarArgs = new SubVarArgs();
//        subVarArgs.print("hello");
    }


}

class BaseVarArgs {
    void print(String... args) {
        System.out.println("Base..test");
    }
}

class SubVarArgs extends BaseVarArgs {

    @Override
    void print(String[] args) {
        System.out.println("Sub..test");
    }
}

