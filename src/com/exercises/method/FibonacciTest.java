package com.exercises.method;

public class FibonacciTest
{
    public static void main(String[] args)
    {
        FibonacciTest test = new FibonacciTest();
        System.out.println(test.fib(10));
    }

    public int fib(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else if (n == 2)
        {
            return 1;
        }
        else
        {
            return fib(n - 2) + fib(n - 1);
        }
    }
}
