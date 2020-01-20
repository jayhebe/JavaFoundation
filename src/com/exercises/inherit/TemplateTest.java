package com.exercises.inherit;

public class TemplateTest
{
    public static void main(String[] args)
    {
        Template t = new SubTemplate();
        t.spendTime();
    }
}


abstract class Template
{
    public void spendTime()
    {
        long startTime = System.currentTimeMillis();

        this.code();

        long endTime = System.currentTimeMillis();

        System.out.println("The spend time of code is " + (endTime - startTime));

    }

    public abstract void code();
}


class SubTemplate extends Template
{
    @Override
    public void code()
    {
        for (int i = 0; i < 100000; i++)
        {
            System.out.println(i);
        }
    }
}