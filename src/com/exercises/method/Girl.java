package com.exercises.method;

public class Girl
{
    private int age;
    private String name;

    public Girl(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void marry(Boy boy)
    {
        System.out.println("I want to marry with " + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl)
    {
        return this.age - girl.age;
    }
}
