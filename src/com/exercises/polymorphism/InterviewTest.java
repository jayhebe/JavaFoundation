package com.exercises.polymorphism;

public class InterviewTest
{
    public static void main(String[] args)
    {
        NewBase base = new NewSub();
        base.add(1, 2, 3);
    }
}

class NewBase
{
    public void add(int i, int... arr)
    {
        System.out.println("NewBase");
    }
}

class NewSub extends NewBase
{
    public void add(int i, int[] arr)
    {
        System.out.println("NewSub");
    }

    public void add(int a, int b, int c)
    {
        System.out.println("NewSub2");
    }
}
