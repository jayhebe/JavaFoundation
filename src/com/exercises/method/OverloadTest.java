package com.exercises.method;

public class OverloadTest
{
    public static void main(String[] args)
    {
        getSum(1, 2);
        getSum(1.0, 2.0);
        getSum("a", "b");
    }

    public static void getSum(int i, int j)
    {
        System.out.println("1");
    }

    public static void getSum(double i, double j)
    {
        System.out.println("2");
    }

    public static void getSum(String m, String n)
    {
        System.out.println("3");
    }
}
