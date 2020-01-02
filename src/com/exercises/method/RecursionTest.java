package com.exercises.method;
/*
已知一个数列：f(0) = 1, f(1) = 4, f(n + 2) = 2 * f(n + 1) + f(n)
其中n是大于0的整数，求f(10)
 */
public class RecursionTest
{
    public static void main(String[] args)
    {
        RecursionTest test = new RecursionTest();
        System.out.println(test.series(10));
    }

    public int series(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else if (n == 1)
        {
            return 4;
        }
        else
        {
            return 2 * series(n - 1) + series(n - 2);
        }
    }
}
