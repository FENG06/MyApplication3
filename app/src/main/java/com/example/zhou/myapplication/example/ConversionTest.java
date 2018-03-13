package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/10/13.
 */

public class ConversionTest {

    {
        int a = 6;
        System.out.println("初始化块");
    }

    {
        System.out.println("第二个初始化块");
    }

    {
        System.out.println("第三个初始化块");
    }


    public ConversionTest() {
        System.out.println("无参的构造函数");
    }

    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        String a = "Hello";
        System.out.println(l);
        int in = 5;
//        boolean b = (boolean) in;
        Object obj = "Hello";
        String objStr = (String) obj;
        System.out.println(objStr);
        Object objPri = new Integer(5);
        String str = (String) objPri;
        System.out.println(str);
        System.out.println(obj instanceof Math);
    }

}
