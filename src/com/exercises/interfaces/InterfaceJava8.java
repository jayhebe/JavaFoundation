package com.exercises.interfaces;

public class InterfaceJava8
{
    public static void main(String[] args)
    {
        SubClass s = new SubClass();
        s.method2();
        MyInterface.method1();
    }
}

interface MyInterface
{
    public static void method1()
    {
        System.out.println("static method");
    }

    public default void method2()
    {
        System.out.println("default method");
    }
}

class SubClass implements MyInterface
{

}