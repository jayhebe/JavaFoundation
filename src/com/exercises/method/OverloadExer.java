package com.exercises.method;

public class OverloadExer
{
    public static void main(String[] args)
    {
        OverloadExer exer = new OverloadExer();

        System.out.println(exer.getMax(2, 3));
        System.out.println(exer.getMax(3.5, 5.7));
        System.out.println(exer.getMax(2.8, -3.1, 9.5));
    }

    public int getMax(int a, int b)
    {
        return (a > b ? a : b);
    }

    public double getMax(double a, double b)
    {
        return (a > b ? a : b);
    }

    public double getMax(double a, double b, double c)
    {
        double max = (a > b ? a : b);

        return (max > c ? max : c);
    }
}
