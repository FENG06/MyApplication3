package com.example.zhou.myapplication.example;

/**
 * Created by Zhou on 2017/9/20.
 */

public class Example8 {

    public static void main(String[] args) {
        new TestTvariable("Test");
//        new TestTvariable("te1", 100);
//        new TestTvariable("te1", 100, 20);
        TestTvariable testTvariable = new TestTvariable();
        testTvariable.increase();
    }


}

/*
 * 区分同名变量，this代表这个对象，调用的自然是这个对象的成员变量
 * 而非方法中的局部变量
 *
 */
class TestTvariable {

    String name;
    static int money, age;
    boolean sex;

    //一、测试变量
    TestTvariable() {

    }

    TestTvariable(String name) {    //传递的参数和TestTvariable类中的name重名
        //   this.name = "类变量name:"+name;	//参数name掩盖了类的字段name，用this可以区分
//        this(name, money);
        System.out.println(this.name);
        System.out.println("局部变量" + name);
        System.out.println(this.money);

    }

    //二、构造方法间的相互调用

    TestTvariable(String name, int money) {
        this(name);            //在此构造方法中调用上一个实现的构造方法，无需重复写代码，
//        int age = 0;

        //构造方法调用构造器，必须位于其第一行，构造方法只能调用一个且仅一次构造器！
        this.money = money;
        System.out.println(money);

    }

    TestTvariable(String name, int money, int age) {
//        this(name, money);

        System.out.println(age);

    }

    public void speak() {
        System.out.print("测试");
    }

	/*注意事项:
     *
	 *被static修饰的方法没有this指针。
	 *因为被static修饰的方法是公共的，不能说属于哪个具体的对象的
	 *
	 */

    /*
     * 关于返回类自身的引用，Thing in Java有个很经典的例子，
     *	通过this 这个关键字返回自身这个对象然后在一条语句里面实现多次的操作
     *
     */
    public TestTvariable increase() {

        money++;
        return this;        //返回自身

    }

    public void myPrint() {

        System.out.println(money);

    }
}

class testVariable extends TestTvariable {

    testVariable testVariable = new testVariable();
    testVariable() {

    }

}
