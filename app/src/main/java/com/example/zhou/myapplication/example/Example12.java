package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/9/26.
 */

class Base
{
    public void method()
    {
        System.out.println("Base");
    }


}
class Son extends Base
{
    public void method()
    {
        System.out.println("Son");
    }

    public void methodB()
    {
        System.out.println("SonB");
    }
}
public class Example12
{
    public static void main(String[] args)
    {
        Base base = new Son();
        base.method();
//        base.methodB();
    }
}