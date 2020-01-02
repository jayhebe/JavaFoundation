package com.exercises.method;

public class MultiArgsTest
{
    public static void main(String[] args)
    {
        MultiArgsTest argsTest = new MultiArgsTest();
        argsTest.show(1);
        argsTest.show("hehe");
        argsTest.show("hahah", "jijiji", "ooo");
    }

    public void show(int i)
    {
        System.out.println("show(int)");
    }

    public void show(String s)
    {
        System.out.println("show(String)");
    }

    public void show(String... ss)
    {
        System.out.println("show(String...)");
    }
}
