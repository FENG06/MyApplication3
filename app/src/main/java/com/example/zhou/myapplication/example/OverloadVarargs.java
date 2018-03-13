package com.example.zhou.myapplication.example;

/**
 * @author Zhou
 * @date 2017/10/24
 */

public class OverloadVarargs {

    public void test(String msg) {
        System.out.println("只有一个字符串参数的test方法");
    }

    public void test(String test,String... books) {
        System.out.println("***形参长度可变的test方法***");
    }

    public void test(String test,int... nums) {
        System.out.println("形参可变的test方法");
    }


//一个方法只能有一个可变长参数，并且这个可变长参数必须是该方法的最后一个参数
//    public void test(ArrayList list, String... strings){
//
//    }
//
//    public void test(ArrayList... list,String... strings){
//
//    }
//
//


    public static void main(String[] args) {
        OverloadVarargs olv = new OverloadVarargs();
        olv.test("qq",1);
        olv.test("aa");
        int [] num = null;
        olv.test("aa",num);
        olv.test("aa", "bb");
//        olv.test(new String[]{"aa"});

    }


}
